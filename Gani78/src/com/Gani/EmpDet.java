package com.Gani;

public class EmpDet {
	void EmpDetails(int id, String string, double Sal) {
		System.out.println("EmpName:"+ string);
		System.out.println("EmpId:"+ id);
		System.out.println("EmpSalary:"+ Sal);


		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDet e = new EmpDet();
		e.EmpDetails(101,"Ganesh",10000);

	}

}
