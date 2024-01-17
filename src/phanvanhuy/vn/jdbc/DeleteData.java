package phanvanhuy.vn.jdbc;

import java.sql.*;

public class DeleteData {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtils.getMSSQLConnection();
		String sql = "DELETE FROM product WHERE ProID = ? ";
		PreparedStatement pstm = connection.prepareStatement(sql);
		pstm.setInt(1, 3);
		int rowCount = pstm.executeUpdate();
		System.out.println("Đã xóa bản ghi (3): " + rowCount);
	}
}
