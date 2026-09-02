package com.javainto;

public class Emp {
	
	protected void finalize() {
		System.out.println("Finalize called..");
	}
	void display() {
		Emp d = new Emp();
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		System.out.println("Main method started..");
		Emp e = new Emp();
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		
		e2.display();// object in method or out of scope


		
		
		e = null;// nullifying object
		
		
		
		e2= e1; //re-assignig   of object
		
		
		
		new Emp();// anonymous object
		
		
		System.gc();// calling garbage collector
		
		
		System.out.println("Main method ended..");


	}

}
