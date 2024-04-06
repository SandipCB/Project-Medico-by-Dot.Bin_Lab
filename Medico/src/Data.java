import java.sql.*;
public class Data {
    public Connection connection;
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
}

