package Project_Medico____Dot.Bin_Lab;

import java.sql.*;
public class Data {
    private Connection connection;
    public Connection getConnection() {
        String dbName = "login_signup_lu";
        String userName = "demouse";
        String password = "07654321@Cse";

try{
Class.forName("com.mysql.cj.jdbc.Driver");
connection = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/"+dbName,userName,password);
System.out.println("YES");
} catch(ClassNotFoundException | SQLException ex){
System.out.println("NO");
}
return connection;
}

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}

