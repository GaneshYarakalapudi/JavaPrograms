package com.javainto;


class A {
    B b;
    @Override
    protected void finalize() throws Throwable {
        System.out.println("A object finalize..");
    }
}

class B {
    A a;
    @Override
    protected void finalize() throws Throwable {
        System.out.println("B object finalize..");
    }
}


public class IslandOfIsolation {
	
	
	
	
	
	public static void main(String[] args) {
		
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.b = obj2;
		obj2.a = obj1;
		
		obj1 = null;
        obj2 = null;
        
		System.gc();
		
		
		
	}

}



