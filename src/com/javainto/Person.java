package com.javainto;

public class Person {
	static String Details(String name, int age) {
		return "name:"+name + " \n"+ "age:" + age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String PD = Details("Ganesh", 20);
	System.out.println(PD);

	}

}
