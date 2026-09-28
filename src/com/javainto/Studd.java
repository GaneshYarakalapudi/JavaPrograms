package com.javainto;

public class Studd {
	int id;
	String name;
	Studd(){
		this(101);
	}
	Studd(int id){
		this(id, "unknoun");
	}
	Studd(int id,String name){
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		Studd s = new Studd();
		Studd s1 = new Studd(101);
		Studd s2 = new Studd(101,"ganesh");

		

		
		
		s.st();
		s1.st();
		s2.st();

		


	}
	void st () {
		System.out.println("*****************");
		System.out.println("id :" + id);
		System.out.println("name :" + name);


		
	}

}
