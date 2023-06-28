package com.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarksheetModel {

	public void Add(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");

		ps.setInt(1, nextPK());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getRollnumber());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemstry());
		ps.setInt(6, bean.getMaths1());

		int i = ps.executeUpdate();

		System.out.println("insert values " + i);

	}

	public List search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from Marksheet");

		ResultSet rs = ps.executeQuery();

		ArrayList list = new ArrayList();

		while (rs.next()) {

			MarksheetBean bean = new MarksheetBean();

			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRollnumber(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemstry(rs.getInt(5));
			bean.setMaths1(rs.getInt(6));
		
			list.add(bean);
		}
		return list;
		}


	public Integer nextPK() throws Exception {

		int PK = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement ps = conn.prepareStatement("Select max(id) from marksheet");

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {

			PK = rs.getInt(1);

		}

		return PK + 1;
	}
	
	public MarksheetBean findByRollNumber(int R_No)throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		
		PreparedStatement ps = conn.prepareStatement("Select * from marksheet where R_No = ?");
		
		ps.setInt(1, R_No);
		
		ResultSet rs = ps.executeQuery();
		MarksheetBean bean = null;
		while(rs.next()) {
			
		 bean = new MarksheetBean();

			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRollnumber(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemstry(rs.getInt(5));
			bean.setMaths1(rs.getInt(6));
		
			
		}
		return bean;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
