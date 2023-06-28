package com.rays.Advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelect {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from marksheet");
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			System.out.print("\t" +rs.getString(2)+ "\t");
			System.out.print(rs.getInt(3));
			System.out.print("\t " +rs.getInt(4));
			System.out.print("\t " +rs.getInt(5));
			System.out.println("\t " +rs.getInt(6));
		}
	
		
	
		
	}

}
