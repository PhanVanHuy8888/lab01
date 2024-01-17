package phanvanhuy.vn.jdbc;

import java.sql.*;

public class InsertData {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException {
			Connection connection =	ConnectionUtils.getMSSQLConnection();
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO product(ProID,ProName,ProQty,ProPrice) ";
			sql += "VALUES(2,'HP Pavilion dv6609wm - BTO',120,2200)";
			int rowCount = statement.executeUpdate(sql);
			System.out.println("Đã thêm mới 1 bản ghi: " + rowCount);
	}
}
