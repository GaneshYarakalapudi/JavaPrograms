package com.javainto;

public class Large {
	static int getGreater(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Highest = getGreater(200,20);
		System.out.println(Highest);
		

	}

}
