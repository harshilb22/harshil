package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println(
		 * "enter the dept"); String dept = scan.next();
		 */
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, " sys as sysdba", "sapient123");
		String sql = "update employees set emp_sal = ? where emp_id = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setDouble(1, 22000);
		st.setInt(2, 11112);
		int rows = st.executeUpdate();
		System.out.println(rows + "affected");
	}
}
