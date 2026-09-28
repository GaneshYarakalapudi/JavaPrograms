package com.javainto;

public class Employee {
	int  id;
	String Name;
	double sal;
	
	Employee(int id, String Name, double sal){
		this.id = id;
		this.Name = Name;
		this.sal = sal;
		
	}
	public static void main(String[] args) {
		Employee e =new Employee(101,"Ganesh",10000);
		e.empinfo();
		
		
	}
	void empinfo() {
		
		System.out.println(id);
		System.out.println(Name);
		System.out.println(sal);


	}

}
