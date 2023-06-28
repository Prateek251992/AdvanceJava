package com.rays.Advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestClass1 {

	public static void main(String[] args) throws Exception {
		testDelete();
		testUpdate();
		testAdd();
		
	}

	private static void testAdd() throws Exception {
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		
		Statement stmt = conn.createStatement();
		
		int i = stmt.executeUpdate("insert into user values(6, 'shuham', 10)");
		
		
		System.out.println("Data Update =" + i);
		
		
		
	}

	private static void testUpdate() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("update user set salary = 20 where id = 1 ");

		System.out.println("Data Update =" + i);

	}

	private static void testDelete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("delete from user where id = 5");

		System.out.println("Data Delete =" + i);
	}

}
