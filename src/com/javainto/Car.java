package com.javainto;

public class Car {
	String model ;
	String brand;
	int year;
	double price ;
	
	Car (){
		 this("Unknown");
		
	}
	Car(String model){
		this(model,"unknown");
		
		
				
	}
	Car(String model, String brand){
		this(model,brand,00);
		
				
	}
	Car(String model, String brand, int year){
		this(model,brand,year,0.0);

		
		
				
	}
	Car(String model, String brand, int year,double price){
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;

		
				
	}

	public static void main(String[] args) {
		System.out.println("Main started................");
		Car c = new Car();
		Car c1 = new Car("Thar");
		Car c3 = new Car("Thar","mahe");
		Car c4 = new Car("Thar","mahe",2024);
		Car c5 = new Car("Thar","mahe",2024,30000);

		c.carInfo();
		c1.carInfo();
		c3.carInfo();
		c4.carInfo();
		c5.carInfo();


		
		
		
		System.out.println("Main ended................");


		
		


	}
	void carInfo() {
		System.out.println("*****************");
		System.out.println("Model:"+ model);
		System.out.println("Brsnd:"+ brand);
		System.out.println("Year:"+ year);
		System.out.println("Price:"+ price);



	}

}
