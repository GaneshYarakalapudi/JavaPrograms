package com.javainto;

public class Frequancy {

	public static void main(String[] args) {
		int[] num = { 1, 2, 2, 3, 2, 4, 5, 1 };
		int target = 2;
		int freq = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == target) {
				freq++;

			}

		}
		System.out.println(freq);

	}

}
