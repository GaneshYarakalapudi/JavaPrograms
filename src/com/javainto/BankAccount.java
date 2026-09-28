package com.javainto;

public class BankAccount {
	int accountNumber;
	String customerName;
	String accountType;
	double balance;
	
	BankAccount(int accountNumber , String customerName ,String accountType ,double balance){
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;
		
	}

	public static void main(String[] args) {
		BankAccount b = new BankAccount(101,"Ganesh","Savings",10000);
		b.infoAccount();


	}
	void infoAccount() {
		System.out.println("My account Number :"+ accountNumber);
		System.out.println("My account Holder Name :"+ customerName);
		System.out.println("My account Tyupe :"+ accountType);
		System.out.println("My account Balance :"+ balance);



	}

}
