package com.javainto;

public class Stu {
	String name ;
	int age;
	String college;
	
	void display() {
		
		System.out.println("name:"+ name);
		System.out.println("age:"+ age);

		System.out.println("college:"+college);

		
	}

	public static void main(String[] args) {
		Stu s = new Stu();

		
		s.name = "Ganesh";
		s.age = 20;
		s.college = "Tkr";
		s.display();

		
		
		

	}

}
