package com.rays.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDataSource {
	private static JdbcDataSource jds = null;
	private ComboPooledDataSource cpds = null;
	
	private JdbcDataSource() {
		try {
			//RsourceBundle rb = ResourceBundle.getBundle("com.rays.Bundle.app");
			cpds = new ComboPooledDataSource();
			cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
			cpds.setJdbcUrl("jdbc:mysql://localhost:3306/advance");
			cpds.setUser("root");
			cpds.setPassword("root");
			cpds.setInitialPoolSize(5);
			cpds.setAcquireIncrement(5);
			cpds.setMaxPoolSize(20);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public static JdbcDataSource getinstance() {
		if (jds == null)	{
			jds = new JdbcDataSource();
		}return jds;
		
    }
	public static Connection getConnection() {
		try {
			return getinstance().cpds.getConnection();
		}catch (SQLException e) {
			return null;
		}
		
	}
	public static void CloseConnection(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs != null)
				rs.close();
			if(stmt != null)
				stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
	}

}
	public static void CloseConnection(Connection conn, Statement stmt) {
		CloseConnection(conn,stmt,null);
		
	}
	public static void CloseConnection(Connection conn) {
		CloseConnection(conn,null,null);
	}
	
}
