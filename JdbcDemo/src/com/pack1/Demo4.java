package com.pack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Demo4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, " sys as sysdba", "sapient123");
		CallableStatement st = conn.prepareCall("{call p5(?,?,?,?)}");
		st.setInt(1, 1002);
		st.registerOutParameter(2, Types.VARCHAR);
		st.registerOutParameter(3, Types.NUMERIC);
		st.registerOutParameter(4, Types.VARCHAR);

		st.execute();
		System.out.println(st.getString(2));
		System.out.println(st.getDouble(3));
		System.out.println(st.getString(4));
		conn.close();
	}

}
