package com.Gani;

public class TestDemoMethod1 {
    static TestDemoMethod1 t = new TestDemoMethod1();
  


	public static void main(String[] args) {
          System.out.println("main methos started....");
//          TestDemoMethod1 t = new TestDemoMethod1();
          welcome();
          t.hello();
	}
	
	
	public static void welcome() {
		System.out.println("Welcome...");
	}
	public void hello() {
		System.out.println("Hello...");
	}


}
