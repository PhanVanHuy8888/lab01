package phanvanhuy.vn.jdbc;

import java.sql.*;

public class ConnectionUtils {
	public static Connection getMSSQLConnection() throws SQLException {
		String driverName = "com.mysql.cj.jdbc.Driver";
        String jdbcUrl = "jdbc:mysql://localhost:3306/productSample";
        String user = "root";
        String pass = "123456";
        Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
        return myConn;
	   }
}
