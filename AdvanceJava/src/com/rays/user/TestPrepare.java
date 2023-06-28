package com.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPrepare {
	
	public static void main(String[] args)throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root", "root");
		
		PreparedStatement Ps = conn.prepareStatement("insert into user value(144, 'kkkk', 222)");
		
		int i = Ps.executeUpdate();
		
		System.out.println("Data inserted = " + i);
	}

}
