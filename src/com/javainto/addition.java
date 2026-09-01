package com.javainto;

public class addition {
	
	


	static int add(int a, int b) {

		int c = a + b;

		System.out.println("Static:"+c);
		addition m= new addition();

		return c;
	
	}
	

	void mul(int x, int y) {
		
		int z = x * y;

		System.out.println("Instance:"+z);
//		addition.add(10, 20);

	}

	public static void main(String[] args) {

		addition.add(10, 20);

		addition a = new addition();
		a.mul(2,3);
		

		System.out.println("Main Method ended");

	}

}
