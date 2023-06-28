package com.rays.bundle;

import java.util.ResourceBundle;

public class TestHi {
	
	public static void main(String[] args) {
		
		ResourceBundle rs = ResourceBundle.getBundle("com.rays.bundle.app_hi");
		
		System.out.println(rs.getString("greetings"));
	}

}
