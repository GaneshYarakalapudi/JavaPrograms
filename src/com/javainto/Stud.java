package com.javainto;

public class Stud {
	String studentName ;
	int studId;
	int StudMarks;
	
	static String collegeName;
	
	
	

	public static void main(String[] args) {
		collegeName = "TKR";
		Stud s = new Stud();
		
		s.studentName = "Ganesh";
		s.studId = 101;
		s.StudMarks=90;
		System.out.println("College:"+ collegeName);
		System.out.println("studName:"+ s.studentName);
		System.out.println("studid:"+ s.studId);
		System.out.println("Marks:"+ s.StudMarks);
		

	}

}
