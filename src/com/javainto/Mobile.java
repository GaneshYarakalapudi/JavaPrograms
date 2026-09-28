package com.javainto;

public class Mobile {
	String model;
	int qty;
	double price;
	double delCharge;
	Mobile(){
		this("unknown");
	}
	Mobile(String model){
		this(model,0);
	}
	Mobile(String model,int qty){
		this(model,qty,0.00);
	}
	Mobile(String model,int qty, double price){
		this(model,qty,price,0);
	}
	Mobile(String model,int qty, double price, double delCharge){
		this.model = model;
		this.price = price;
		this.qty = qty;
		this.delCharge = delCharge;
	}

	public static void main(String[] args) {
		

		Mobile m = new Mobile();
		Mobile m1 = new Mobile("pro");
		Mobile m2 = new Mobile("pro",2,20000);
		Mobile m3 = new Mobile("pro",2,20000,50);
		m.mInfo();
		m1.mInfo();

		m2.mInfo();
		m3.mInfo();



		

	}
	void mInfo() {
		System.out.println("****************");
		double mobileCost =  (price * qty);
		double bill = mobileCost + delCharge;
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
		System.out.println("Quntity: " + qty);
		System.out.println("Delivery Charge: " + delCharge);
		System.out.println("Mobile Cost : " + mobileCost);
		System.out.println("Bill: " + bill);


		
		
		
	}

}
