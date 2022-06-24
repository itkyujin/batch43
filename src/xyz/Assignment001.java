package xyz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment001 {
    public static void main(String[] args) {

        String connectionUrl = "jdbc:mysql://localhost:3306/petstore?user=root&password=password1234";
        Connection connection = null;
        String query = null;
        Statement statement = null;
        ResultSet results = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(connectionUrl);
        }catch (ClassNotFoundException exception) {
            System.out.println("Failed to read driver"+exception.getMessage());
        }catch (SQLException e) {
            System.out.println("Unable to connect"+e.getMessage());
        }

        query = "select * from users";

        try {
            statement = connection.createStatement();
            results = statement.executeQuery(query);
            while(results.next()) {
                System.out.println("user id: "+results.getString(1));
                System.out.println("first name: "+results.getString(3));
            }

        } catch (SQLException e) {
            System.out.println("Get error: "+e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                results.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Get error"+e.getMessage());
                e.printStackTrace();
            }
        }
    }
}