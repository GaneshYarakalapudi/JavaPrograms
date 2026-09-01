package com.javainto;

public class Search {

	public static void main(String[] args) {
		int [] num= {1,2,3,4,5};
		int target = 4;
		int found_index = -1;
		for (int i=0; i<num.length; i++) {
			
			if (num[i] == target){
				found_index = i;
				System.out.println("found at index:"+i);
				break;
			}
			
		}
		

	}

}
