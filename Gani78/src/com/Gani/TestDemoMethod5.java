package com.Gani;
import java.util.Scanner;

public class TestDemoMethod5 {
	Scanner s = new Scanner(System.in);

	 void main() {
		 
		 System.out.println("Main Started..");
		 
		 double bs = basicSalary();
		 double h = hra();
		 double lt = lta();
		 double sp = speical();
		 
		 System.out.println("Enter fixed composition :" +( bs + h + lt + sp));

	
		 System.out.println("Main ended..");



	}
	 double basicSalary() {
		 System.out.println("enetr your basic salary:");
		  double bs = s.nextDouble();
		  return bs;
	 }
	 
	 double hra() {
		 System.out.println("enetr your basic HRA:");
		  double HRA = s.nextDouble();
		  return HRA;
	 }
	 
	 double lta() {
		 System.out.println("enetr your basic LTA:");
		  return s.nextDouble();
	 }
	 
	 double speical() {
		 System.out.println("enetr your Special allowance:");
		  double spa = s.nextDouble();
		  return spa;
	 }

}
