package com.javainto;

public class Method {
	static {
		Method b = new Method();

		b.n2();

	}

	static void m1() {

		System.out.println("M1 caalled...");

	}

	static void m2() {
		m1();

		System.out.println("M2 caalled...");

	}

	void n1() {
		m2();

		System.out.println("N1 caalled...");

	}

	void n2() {

		System.out.println("N1 caalled...");
		n1();

	}

	public static void main(String[] args) {

	}

}
