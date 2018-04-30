package com.haris.SpringWebFlux_Reactor_Stream;

public class Gold {

	private static float price;
	
	static float getPrice() {
		
		price=  (float)(Math.random()*(40 - 43))+ 40;
		return price;
	}	
	
}
