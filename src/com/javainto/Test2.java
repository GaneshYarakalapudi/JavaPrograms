package com.javainto;

public class Test2 {
	static Test2 t = new Test2();
	native void show1();// calling the native method from c,c++ project and intialize method in java..

	
	void  method5() {
		System.out.println(" method5 called");

		
	}
	
	static void  method4() {
		t.method5();

		
		System.out.println(" method4 called");

		
	}
	
	void method3() {
		method4();
		System.out.println(" method3 called");
	}
	
	void method2() {
		method3();
		System.out.println(" method2 called");
	}
	
	static void show() {
		
		System.out.println("show called");
		
		
	}
	
	void  play() {
		
	 method2();
		
		System.out.println("play called");
		
		
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		show();
		
		
		
//		Test2 t = new Test2();
		t.play();
		
		
//		t.method5();
		
		
		
		
		System.out.println("main method ended");
		

	}

}
