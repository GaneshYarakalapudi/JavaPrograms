package com.javainto;

public class Interest {
	static double getInterest(double r, double p, double t) {
		double Sp = (p*r*t)/100;
		return Sp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double SI = getInterest(100,10,2);
		System.out.println(SI);

	}

}
