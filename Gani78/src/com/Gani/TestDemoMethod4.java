package com.Gani;
import java.util.Scanner;
public class TestDemoMethod4 {

	public static void main(String[] args) {
		
		System.out.println("Main Started...");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String fname = s.nextLine();
		
		System.out.println("Enter your last name:");
		String lname = s.nextLine();
		
		System.out.println("Enter your Height:");
		float height = s.nextFloat();
		
		System.out.println("Enter your weight:");
		double weight = s.nextDouble();
		
		System.out.println("Enter your age:");
		double age = s.nextInt();
		
		
		System.out.println("Enter your Gender:");
		char c = s.next().charAt(0);
		
		getfullname(fname,lname);
		getheightandweight(height,weight);
		getage(age);
		Gender(c);
		
		
	
		
		
		System.out.println("Main ended...");

 
	}
	static void getfullname(String Fname, String Lname) {
		System.out.println("Full Name:" + Fname + " "+ Lname);
	}
	
	static void getheightandweight(float height, double weight) {
		System.out.println("Height:"+ height);
		System.out.println("weight:"+ weight);

	}
	static void getage(double age) {
		System.out.println("age:" + age);

	}
	
	static void Gender( char c) {
		System.out.println("Gender: " + c);

	}
	
	

	
	
}
