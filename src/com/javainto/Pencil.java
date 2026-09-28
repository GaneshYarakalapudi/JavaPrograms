package com.javainto;

public class Pencil {
	int rup = 100;
	int penc = 7;
	int balance;
	int count = 0;
	int b = 0;
	int a = 0;

	void dis() {
		int count = rup / penc;
		int b = count * penc;
		int a = rup - b;

		System.out.println("how many buy :" + count);
		System.out.println("balance :" + a);

	}

	public static void main(String[] args) {
		Pencil p = new Pencil();
		p.dis();

	}

}
