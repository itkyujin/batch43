package lab02_parser;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXmlResultSet {

    public static void main(String[] args) {

        // String to connect to local database
        String connectionUrl = "jdbc:mysql://localhost:3306/carsdb?user=root&password=password1234";

        // Connection, Statement, and ResultSet objects set to null
        Connection connection = null;
        Statement stmt = null;
        ResultSet res = null;

        try {
        // Attempt to connect to database
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(connectionUrl);
            System.out.println("Connection has been established");

        } catch (ClassNotFoundException exception) {
            System.out.println("Failed to read driver : " + exception.getMessage());

        } catch (SQLException e) {
            System.out.println("Unable to connect: " + e.getMessage());
        }

        try {

            stmt = connection.createStatement();

            res = stmt.executeQuery("SELECT * from sportscars");

            try{
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

                DocumentBuilder builder = factory.newDocumentBuilder();

                Document doc = builder.newDocument();

                Element rootElement = doc.createElement("cars");
                doc.appendChild(rootElement);

                ResultSetMetaData metaData = res.getMetaData();
                int columnCount = metaData.getColumnCount();

                while (res.next()) {

                    Element car = doc.createElement("car");
                    rootElement.appendChild(car);

                    for (int i = 1; i <=columnCount; i++) {

                        String columnName = metaData.getColumnName(i);
                        Object value = res.getObject(i);

                        Element node = doc.createElement(columnName);
                        node.appendChild(doc.createElement(value.toString()));
                        car.appendChild(node);

                        TransformerFactory transformerFactory = TransformerFactory.newInstance();

                        Transformer transformer = transformerFactory.newTransformer();
                        DOMSource source = new DOMSource(doc);
                        StreamResult streamRes = new StreamResult(new File("cars.xml"));

                        transformer.transform(source, streamRes);

                        StreamResult consoleRes = new StreamResult(System.out);
                        transformer.transform(source, consoleRes);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                assert res != null;
                res.close();
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Get error " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
