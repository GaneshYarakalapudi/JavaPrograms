package com.javainto;

public class Inst {
	static  String Trainer1;
	static  String Trainer2;
	
	
	
	
	String EmpName;
	int EmpId;
	String EmpDesignation;
	
	
	

	public static void main(String[] args) {
//		
		
		 Inst mca = new Inst();
		
		Inst bca = new Inst();
		
		Inst cse = new Inst();
		
		Inst IT = new Inst();
		
		Inst ECE  = new Inst();
		
//		Trainer1 = "Sai";
//		Trainer2= "Mano";
		Inst i = new Inst();
		
		i.EmpName = "Ganesh";
		i.EmpId = 101;
		i.EmpDesignation = "IT";
		
		Trainer1 = "Sai";
		Trainer2= "Mano";
		
		System.out.println("Trainer1:" + Trainer1);
		System.out.println("Trainer2:" + Trainer2);

		System.out.println("Employee Name:" + i.EmpName);

		System.out.println("Employee Id:" + i.EmpId);

		System.out.println("Emp Desg:" + i.EmpDesignation);
		
		mca.EmpName = "qqq";
		mca.EmpId = 102;
		mca.EmpDesignation = "aaaa";
		
		System.out.println("Trainer1:" + Trainer1);
		System.out.println("Trainer2:" + Trainer2);
		System.out.println("Employee Name:" + mca.EmpName);

		System.out.println("Employee Id:" + mca.EmpId);

		System.out.println("Emp Desg:" + mca.EmpDesignation);


		
		

	}

}
