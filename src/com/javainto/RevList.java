package com.javainto;
import java.util.Arrays;  

public class RevList {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int start = 0;
		int end = 4;
		int temp;

		while (start < end) {
			temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			start++;
			end--;
		
		}
		System.out.println(Arrays.toString(numbers));
	}
	
}
