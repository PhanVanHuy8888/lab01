package phanvanhuy.vn.jdbc;

import java.sql.*;


public class InsertPreparedStatement {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException {
			Connection connection = ConnectionUtils.getMSSQLConnection();
			String sql = "INSERT INTO product(ProID,ProName,ProQty,ProPrice) ";
			sql += " VALUES(?,?,?,?)";
			PreparedStatement pstm =connection.prepareStatement(sql);
			pstm.setInt(1, 3);
			pstm.setString(2,"HP Pavilion dv4t - BTO");
			pstm.setInt(3, 50);
			pstm.setFloat(4, 1500);
			int rowCount = pstm.executeUpdate();
			System.out.println("Đã thêm mới 1 bản ghi: " +rowCount);
		}
}
