package com.javainto;

public class Student1 {
	int Sid;
	String Name;
	Student1( ){
		System.out.println("Constructor called...");
		Sid = 101;
		Name = "sss";
		
	}
	Student1(int sid,String Name ){
		System.out.println("Constructor called...");
		this.Sid = sid;
		this.Name = Name;
		
	}

	public static void main(String[] args) {
		Student1 s5=new Student1(100,"Ganesh");
		s5.s1();
		Student1 s4=new Student1();
		s4.s1();
		Student1 s3=new Student1();
		s3.s1();



		Student1 s2=new Student1();
		s2.s1();
		Student1 s =new Student1();
		s.s1();
		s.Sid = 103;
		s.Name = "gg";
		s.s1();
		
		

	}
	void s1() {
		System.out.println("*****************");
		System.out.println(Sid);
		System.out.println(Name);

		
	}

}
