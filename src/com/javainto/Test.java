package com.javainto;

public class Test {
	
	
	
	
	static {
		System.out.println("Static");
	
	}
	{
		System.out.println("Instace");
		
	}
	public static void main(String[] args) {
		System.out.println("main");
		
		Test t = new Test();

}
}

