package com.javainto;

public class Cricket {
	static int countryId=93;
	static String countryName="unk";
	int jerseyNo;
	String playerName;

	public static void main(String[] args) {
		Cricket.countryId = 91;
		Cricket.countryName = "India";

		Cricket msd = new Cricket();

		msd.jerseyNo = 7;
		msd.playerName = "Mahi";
		System.out.println("CountryId:" + countryId);
		System.out.println("countryName:" + countryName);
		System.out.println("jerseyNo:" + msd.jerseyNo);
		System.out.println("playerName:" + msd.playerName);
		
		
		
		Cricket.countryId = 92;
		Cricket.countryName = "Ind";
		Cricket vk = new Cricket();

		vk.jerseyNo = 18;
		vk.playerName = "Virat";
		System.out.println("CountryId:" + countryId);
		System.out.println("countryName:" + countryName);
		System.out.println("jerseyNo:" + vk.jerseyNo);
		System.out.println("playerName:" + vk.playerName);


	}

}
