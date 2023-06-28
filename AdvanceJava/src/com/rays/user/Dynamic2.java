package com.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dynamic2 {

	public static void main(String[] args) throws Exception {

		// Add(int id,String name,int salary);
		//Update();
		Delete();
	}

	public static void Add(int id, String name, int salary) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost3306/advance", "root", "root");

		PreparedStatement Ps = conn.prepareStatement("insert into user values( ?,?,?)");

		Ps.setInt(1, id);
		Ps.setString(2, name);
		Ps.setInt(3, salary);

		int i = Ps.executeUpdate();

		System.out.println("insert value " + i);

	}

	public static void Update() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement Ps = conn.prepareStatement("Update user set name = ? where id = ?");

		Ps.setString(1, "ssss");
		Ps.setInt(2, 2);

		int i = Ps.executeUpdate();

		System.out.println("insert value " + i);

	}
	public static void Delete() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement Ps = conn.prepareStatement("Delete from user where id = ?");

		Ps.setInt(1, 1);

		int i = Ps.executeUpdate();

		System.out.println("insert value " + i);
	}

}