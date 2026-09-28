package com.javainto;

public class EvenorOdd {
	static String getEorO(int a ) {
		if (a % 2==0) {
			return "Even";
		}
		else {
			return "odd";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the number is:"+getEorO(2));

	}

}
