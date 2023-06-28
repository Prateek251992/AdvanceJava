package com.rays.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.rays.marksheet.MarksheetBean;

public class TestJdbc {
	public static void main(String[] args)throws Exception {
		for (int i = 1; i< 25; i++) {
			System.out.println("Connection = " + i);
			testDcp();
			System.out.println("============================");
			
		}
		
	}
	private static void testDcp() throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement stmt = conn.prepareStatement("select * from user where id = 1");
		ResultSet rs = stmt.executeQuery();
		MarksheetBean Bean = null;
		while(rs.next()) {
			Bean = new MarksheetBean();
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getInt(4));
			System.out.println(rs.getInt(5));
			System.out.println(rs.getInt(6));
		}
	}

}
