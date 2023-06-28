package com.rays.bundle;

import java.util.ResourceBundle;

public class TestClass {
	
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app");
		
		System.out.println("Driver = "+ rb.getString("Driver"));
		System.out.println(rb.getString("Url"));
		System.out.println(rb.getString("User"));
		System.out.println(rb.getString("password"));
		System.out.println(rb.getString("initial"));
		System.out.println(rb.getString("incriment"));
		System.out.println(rb.getString("maximumpool"));
	}

}
