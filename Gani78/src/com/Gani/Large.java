package com.Gani;

public class Large {
	void getLarge(int a , int b) {
		if(a > b) {
			System.out.println("A is gretater");
		}
		else {
			System.out.println("B is gretater");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Large l = new Large();
		l.getLarge(40, 30);

	}

}
