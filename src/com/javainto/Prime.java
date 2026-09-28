package com.javainto;

public class Prime {

	public static void main(String[] args) {
		int n = 17;
		boolean prime = true;
		if (n<2) {
			prime = false;
		}
		for (int i=2; i * i <=n; i++ ) {
			if (n%i == 0) {
				prime = false;
				break;
			}
		}
		System.out.println( prime ? "prime " : "not prime");
		

	}

}
