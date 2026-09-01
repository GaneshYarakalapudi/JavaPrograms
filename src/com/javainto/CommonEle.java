
package com.javainto;

import java.util.ArrayList;
import java.util.List;

public class CommonEle {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 3, 4, 5, 6, 7 };
		List<Integer> common = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					common.add(a[i]);

				}
			}
			

		}
		System.out.println("common elements:" + common);

	}
}
