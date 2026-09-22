package com.Gani;

public class TestDemoMethod2 {

	public static void main(String[] args) {
		System.out.println("Main started ");
		TestDemoMethod2 t = new TestDemoMethod2();
		
		
//		call by value passing the arguments
		t.add(10, 20);
		t.sub(100, 200);
		t.mul(87, 876);
		t.modu(98, 5);
		t.div(98, 5);
		
		
		
//	
		System.out.println("Main started ");

	}
	public void add(int a, int b) {
		System.out.println("addition called ");
		System.out.println(a + b);


		
	}
	public void sub(int a, int b) {
		System.out.println("sub called ");
		System.out.println(a - b);


		
	}
	public void mul(int a, int b) {
		System.out.println("mul called ");
		System.out.println(a * b);


		
	}
	public void modu(int a, int b) {
		System.out.println("mod called ");
		System.out.println(a % b);


		
	}
	public void div(int a, int b) {
		System.out.println("div called ");
		System.out.println(a / b);


		
	}

}
