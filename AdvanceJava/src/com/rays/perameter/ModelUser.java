package com.rays.perameter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ModelUser {

	public List SearchByParameter(UserBean bn) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance", "root", "root");
		StringBuffer sql = new StringBuffer("Select * from Marksheet where 1 = 1");

		if (bn != null) {
			sql.append(" and Id = " + bn.getId());
			System.out.println("sql =" + sql);
		}
		PreparedStatement ps = conn.prepareStatement(sql.toString());
		ResultSet rs = ps.executeQuery();
		ArrayList list = new ArrayList();

		while (rs.next()) {
			bn = new UserBean();
			bn.setId(rs.getInt(1));
			bn.setName(rs.getString(2));
			bn.setRolln(rs.getInt(3));
			bn.setPhysics(rs.getInt(4));
			bn.setChemstry(rs.getInt(5));
			bn.setMaths1(rs.getInt(6));
			list.add(bn);

		}
		return list;
	}

}
