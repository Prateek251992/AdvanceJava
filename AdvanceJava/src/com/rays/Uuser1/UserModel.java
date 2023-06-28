package com.rays.Uuser1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserModel {

	public void Add(UserBean b) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement Ps = conn.prepareStatement("insert into user values(?,?,?)");

		Ps.setInt(1, b.getId());
		Ps.setString(2, b.getName());
		Ps.setInt(3, b.getSalary());

		int i = Ps.executeUpdate();

		System.out.println("insert value " + i);
	}

	public void Update(UserBean u) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement Ps = conn.prepareStatement("update user set name = ? where id = ? ");

		Ps.setString(1, u.getName());
		Ps.setInt(2, u.getId());

		int i = Ps.executeUpdate();

		System.out.println("Updated value " + i);
	}

	public void Detete(UserBean b) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement ps = conn.prepareStatement("Delete from user where id =  ?");
		
		b.getId();

		int i = ps.executeUpdate();

		System.out.println("insert value " + i);
	}

}