package project;

import java.sql.*;

public class ConnectionProvider {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sam", "Sandip Chakraborty", "205874118027108512sandipchakraborty");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }

}
