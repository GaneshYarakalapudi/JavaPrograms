package com.javainto;

public class PremiEmp {
	byte Id = 120;
	short age = 50;
	double sal = 30000.30;
	float grade = 8.9f;
	boolean act = true;
	int leaves = 130;
	long phone = 981348034L;
	int  count = leaves;
	
	 void leav() {
		leaves --;
		System.out.println("available leaves:"+ leaves);
		
		
	}
	
	
	

	public static void main(String[] args) {
		PremiEmp p = new PremiEmp();
		p.leav();
		p.leav();
		p.leav();
		System.out.println("Employee Id :"+p.Id);
		System.out.println("Employee age :"+p.age);
		System.out.println("Employee sal :"+p.sal);
		System.out.println("Employee grade :"+p.grade);
		System.out.println("Employee active :"+p.act);
		System.out.println("Employee Leaves :"+p.leaves);
		System.out.println("Employee PhoneNo :"+p.phone);



	
		

	}

}
