package xyz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementTest {

    public static void main(String[] args) {


        String connectionUrl = "jdbc:mysql://localhost:3306/petstore?user=root&password=password1234";
        Connection connection = null;
        String query = null;
        PreparedStatement preparedStatement = null;
        ResultSet results = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(connectionUrl);
        }catch (ClassNotFoundException exception) {
            System.out.println("Failed to read driver"+exception.getMessage());
        }catch (SQLException e) {
            System.out.println("Unable to connect"+e.getMessage());
        }

        query = "INSERT INTO USERS(USER_ID, PASSWORD, FIRST_NAME) VALUES(?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "USER5");
            preparedStatement.setString(2, "ROOT");
            preparedStatement.setString(3, "USER5");
            int rowsAltered = preparedStatement.executeUpdate();
            System.out.println(rowsAltered);

        } catch (SQLException e) {
            System.out.println("Get error: "+e.getMessage());
            e.printStackTrace();
        } finally {
            try {

                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Get error"+e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
