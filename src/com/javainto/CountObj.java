package com.javainto;

public class CountObj {
  static int count = 0;
	
	
	{
		count++;
	}
	

	public static void main(String[] args) {
		
		CountObj obj1 = new CountObj();
		CountObj obj2 = new CountObj();
		CountObj obj3 = new CountObj();
		
		System.out.println("number of objects created:"+ count);


		
	

	}

}
