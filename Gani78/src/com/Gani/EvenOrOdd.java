package com.Gani;

public class EvenOrOdd {
	void checkEvenorOdd(int num) {
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
			
		
	}

	public static void main(String[] args) {
		EvenOrOdd e = new EvenOrOdd();
		e.checkEvenorOdd(3);
		


	}

}
