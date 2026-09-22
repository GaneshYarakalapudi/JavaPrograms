package com.Gani;

import java.util.Scanner;

public class BugTracker {

	int bugId;
	String aName;
	String Bugtitle;
	String Severity;
	boolean status;
	String devName;
	
	
	
	
	
	
	

	void main() {


		BugTracker b1 = new BugTracker();
		
		b1.bugId = 101;
		
		b1.aName = "Gaming";
		b1.Bugtitle="Bug";
		b1.Severity="high";
		b1.status= true;
		b1.devName="ganeh";
		
		b1.dis();



		


	}

	int getbugid() {
		return bugId;
	}

	String getApplicationName() {
		return aName;
	}

	String bugName() {
		return Bugtitle;
	}
	String getseverity() {
		return Severity;
	}
	boolean getstatus() {
		return status;
	}
	String getdevName() {
		return devName;
	}
	
	
	void  getassign(int bugid, String devname) {
		System.out.println("Bug Id :"+ bugid + " "+ "DeveloperName:" + devname);

		
	}
	
	void dis() {
		System.out.println("BugId:" + getbugid());
		System.out.println("appName:" + getApplicationName());
		System.out.println("Bugname:" + bugName());
		System.out.println("Severity:" + getseverity());
		System.out.println("Status:" + getstatus());
		System.out.println("developerName:" + getdevName());
//		System.out.println("Assign:" + getassign(int bugid = 10, String devname="gani"));






	}

}
