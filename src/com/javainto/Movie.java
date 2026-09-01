package com.javainto;

import java.sql.Date;

public class Movie {
  
	
	static String theatre, location;
	String moviename;
	int movieBudget;
	 String movieDate;
	

	public static void main(String[] args) {
		
		theatre = "Mythri";
		
		location = "Hyd";
		Movie m = new Movie();
		Movie t = new Movie();
		Movie a = new Movie();
		Movie b = new Movie();
		Movie c = new Movie();
		
		m.moviename = "qqq";
		m.movieBudget = 123;
		m.movieDate = "2020-01-20";
		
		System.out.println(theatre);	
		System.out.println(location);
		System.out.println(m.moviename);	
		System.out.println(m.movieBudget);	
		System.out.println(m.movieDate);	
		
		
		t.moviename = "bb";
		t.movieBudget = 12322;
		t.movieDate = "2020-04-20";
		
		
		System.out.println(theatre);	
		System.out.println(location);
		System.out.println(t.moviename);	
		System.out.println(t.movieBudget);	
		System.out.println(t.movieDate);	
		
		
		

	}

}
