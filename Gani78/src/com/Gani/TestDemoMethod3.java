package com.Gani;

public class TestDemoMethod3 {

	public static void main(String[] args) {
		System.out.println("Main started....");
		System.out.println("My personal info....");

		ageinfo(20);
		weightinfo(50.2);
		heigthinfo(5.6f);
		sscmarks(30,30,50,60,40);
		
		
		
		
		
		System.out.println("Main ended....");


	}
	
	static void getFullName(String Fname, String Lname) {
		System.out.println("Full name:" + Fname + " " + Lname);
		
	}
	static void ageinfo( int age) {
		System.out.println("age:" + age);
	}
	static void weightinfo( double weight) {
		System.out.println("weight:" + weight);
	}
	static void heigthinfo( float height) {
		System.out.println("height:" + height);
	}
	static void sscmarks( int t , int e, int m , int s , int sci ) {
		double sum = t + e  + m + s + sci; 
		System.out.println("total" + sum);
		double avg = sum / 5;
		System.out.println("avg marks:"+ avg);
	}

}
