package com.Gani;

import com.Gani.Add;

public class Add {
	static int add(int a, int b) {

		int c = a + b;

		System.out.println("Static:"+c);
		Add m= new Add();

		return c;
	
	}
	

	public static void main(String[] args) {
		Add.add(10, 20);
	}

}
