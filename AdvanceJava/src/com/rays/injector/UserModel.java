package com.rays.injector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.rays.marksheet.MarksheetBean;

public class UserModel {

	public List searchByAnyParameter() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from marksheet");
		ResultSet rs = ps.executeQuery();
		ArrayList list = new ArrayList();

		UserBean bean1 = null;
		while (rs.next()) {
			bean1 = new UserBean();
			bean1.setId(rs.getInt(1));
			bean1.setName(rs.getString(2));
			bean1.setRollno(rs.getInt(3));
			bean1.setPhysics(rs.getInt(4));
			bean1.setChemsrty(rs.getInt(5));
			bean1.setMaths1(rs.getInt(6));

			list.add(bean1);

		}
		return list;
	}

}
