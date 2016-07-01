package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println(
		 * "enter the dept"); String dept = scan.next();
		 */
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, " sys as sysdba", "sapient123");
		String sql = "select * from employees where emp_sal between ? and ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setDouble(1, 15000);
		st.setDouble(2, 32000);
		/* st.setString(1, dept); */
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			System.out.println("id" + rs.getInt("emp_id"));
			System.out.println("name" + rs.getString("emp_name"));
			System.out.println("salary" + rs.getDouble("emp_sal"));
			System.out.println("doj" + rs.getDate("emp_doj"));
			System.out.println("dept" + rs.getString("emp_dept"));

			System.out.println("---------------");
		}
		conn.close();
	}
}
