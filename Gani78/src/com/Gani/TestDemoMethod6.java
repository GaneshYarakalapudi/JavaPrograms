package com.Gani;
import java.util.Scanner;
public class TestDemoMethod6 {
	
	double balance = 100000.00;

	 void main() {
		 System.out.println("main method started ");
		 System.out.println("Welcome to Vcube Banking !!");
		 
		 Scanner s = new Scanner(System.in);

		 
		 System.out.println("Enter deposite balance:");
		 double dep = s.nextDouble();
		 balance=deposite(dep);
		 System.out.println("After deposite your current balance is:" + balance);
		 
		 System.out.println("Enter  withdraw Amount:");
		 double wi = s.nextDouble();
		 balance = withdraw(wi);
		 System.out.println("After withdraw your amount current balance is:" + balance);
		 
		 
		 System.out.println("main method ended ");




	}
	  double deposite (double dAmount) {
		  if (dAmount >=100) {
			  balance = balance + dAmount;
			  
		  }
		  else{
			  System.out.println("INSUFFIENT");
			
		  }
		  return balance;
		  
		  
	  }
	  
	  double withdraw (double wAmount) {
		  if (wAmount <=balance) {
			  balance = balance - wAmount;
			  
		  }
		  else{
			  System.out.println("INSUFFIENT");
			
		  }
		  return balance;
		  
		  
	  }
	  void checkbalance() {
		  System.out.println("your current balance is:"+ balance);
	  }

}
