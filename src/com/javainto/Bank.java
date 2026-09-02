package com.javainto;

public class Bank {
	int AccNo;
	String Name;
	int balance ;
	static int   accnogen=1000;
	{
		accnogen++;
		AccNo = accnogen;
		
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		
		
		
		b.Name="ggg";
		b.balance=300;
		System.out.println("Accno:"+b.AccNo);
		System.out.println("Name:"+b.Name);
		System.out.println("balnce:"+b.balance);
		
		Bank b1 = new Bank();

		
		b1.Name="ggd";
		b1.balance=3000;
		System.out.println("Accno:"+b1.AccNo);

		System.out.println("Name:"+b1.Name);
		System.out.println("balnce:"+b1.balance);


		
		
		

	}

}
