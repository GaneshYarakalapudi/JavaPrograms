package com.javainto;

public class ThreeObj {
	int empId;
	String Empname;
	int empsal;
	void method1() {
		empId = 123;
		Empname = "ganesh";
		empsal = 20000;
		System.out.println("Empid :" + empId);
		System.out.println("Empname :" + Empname);
		System.out.println("EmpSal :" + empsal);

		
	}
	void method2() {
		empId = 124;
		Empname = "sai";
		empsal = 30000;
		System.out.println("Empid :" + empId);
		System.out.println("Empname :" + Empname);
		System.out.println("EmpSal :" + empsal);

		
	}
	void method3() {
		empId = 124;
		Empname = "mano";
		empsal = 40000;
		System.out.println("Empid :" + empId);
		System.out.println("Empname :" + Empname);
		System.out.println("EmpSal :" + empsal);

		
	}



	public static void main(String[] args) {
		ThreeObj o = new ThreeObj();
		ThreeObj p = new ThreeObj();
		ThreeObj q = new ThreeObj();
		o.method1();
		p.method2();
		q.method3();


	

	}

}
