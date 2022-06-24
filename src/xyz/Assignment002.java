package xyz;

import java.sql.*;

public class Assignment002 {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/petstore?user=root&password=password1234";

        Connection connection = null;
        String query = null;
        Statement statement = null;
        ResultSet results = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url);
        }catch (ClassNotFoundException e) {
            System.out.println("Failed to read driver"+e.getMessage());
            e.printStackTrace();
            connection = null;
        }catch (SQLException e1) {
            System.out.println("Unable to connect"+e1.getMessage());
            e1.printStackTrace();
        }

        query = "select * from users";

        try {
            statement = connection.createStatement();
            results = statement.executeQuery(query);

            if(results.next()){
                System.out.println("user id:" + results.getString(1));
                System.out.println("password:" + results.getString(2));

            }
        }catch (SQLException sqle){
            System.out.println("getData:" +sqle.getMessage());
        }
    }
}
