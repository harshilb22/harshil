package com.sapient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sapient.util.EmpUtil;

/**
 * Abstract class having methods for getting and closing a connection
 * 
 * @author hbharg
 *
 */
public abstract class AEmpDao {
	static {
		String driver = EmpUtil.getBundle().getString("driver");
		EmpUtil.viewLogger().trace(driver);
		try {
			Class.forName(driver);
			EmpUtil.viewLogger().debug("driver loaded");
		} catch (ClassNotFoundException e) {
			EmpUtil.viewLogger().error(e.getMessage());
		}
	}

	/**
	 * 
	 * @return connection instance based on the DB details configured in
	 *         properties file.
	 * 
	 */
	public Connection getConn() {
		Connection conn = null;
		String url = EmpUtil.getBundle().getString("url");
		String uname = EmpUtil.getBundle().getString("uname");
		String pwd = EmpUtil.getBundle().getString("pwd");
		EmpUtil.viewLogger().trace(url + " " + uname + " " + pwd);
		try {
			conn = DriverManager.getConnection(url, uname, pwd);
			EmpUtil.viewLogger().debug("Db connection established");
		} catch (SQLException e) {
			EmpUtil.viewLogger().error("Db connection failed");
		}
		return conn;
	}

	/**
	 * this method closes the connection
	 * 
	 * @param conn
	 */
	public void closeConn(Connection conn) {
		if (conn != null) {
			EmpUtil.viewLogger().trace("connection not null");

			try {

				conn.close();
				EmpUtil.viewLogger().debug("Db connection closed");
			} catch (SQLException e) {
				EmpUtil.viewLogger().error("Db connection fails to close");
			}
		} else {
			EmpUtil.viewLogger().trace("connection is null");
		}

	}
}
