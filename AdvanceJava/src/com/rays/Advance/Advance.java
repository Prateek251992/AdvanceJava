package com.rays.Advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Advance {
	
	public static void main(String[] args) throws Exception  {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		
		Statement stmt = conn.createStatement();
		
		int i = stmt.executeUpdate("insert into user values(5, 'shuham', 10)");
		
		
		System.out.println("Data Update =" + i);
		
		
	
	}

}
