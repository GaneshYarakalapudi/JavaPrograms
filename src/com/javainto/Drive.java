package com.javainto;

public class Drive {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Hello Bhiyya");
		
		Class.forName("java.lang.String");
		Class.forName("java.lang.System");
		Class.forName("com.javainto.Student");
		Class.forName("com.javainto.Student1");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver");



	}

}
