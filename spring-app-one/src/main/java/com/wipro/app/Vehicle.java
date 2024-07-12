package com.wipro.app;

public class Vehicle {
	
	public Vehicle() {
	
	}

	public void start() {
		System.out.println("Vehicle started");
	}
	
	public void travel(String from,String to) {
		System.out.println("traveling from "+from+"  to "+to);
	}
	
	public void stop() {
		System.out.println("Vehicle stopped");
	}
		
}
