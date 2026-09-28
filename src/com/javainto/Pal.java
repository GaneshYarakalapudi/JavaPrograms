package com.javainto;

public class Pal {

	public static void main(String[] args) {
		int n = 121;
		int orginal = n;
		int rev =0;
		while (n!=0) {
			int digit = n%10;
			rev = rev* 10 + digit;
			n = n/10;
		}
		if (orginal == rev) {
			System.out.println("palidrone");
		}
		
		else{
			System.out.println("Not");

		}

	}

}
