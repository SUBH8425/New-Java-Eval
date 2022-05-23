package com.day3;

public class Car {
	
	String model;
	String companyName;
	String color;
	String engine;
	
	void Engine(int r, int p, String c, boolean t) {
		
		int rpm = r;
		int power = p;
		String manufacturer=c;
		boolean hadTurbo = t;
		
		System.out.println("car RPM :"+rpm);
		System.out.println("Car Power :"+power);
		System.out.println("Car Manufacturer :"+manufacturer);
		System.out.println("Car hasTurbo :"+hadTurbo);

	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car();
		
		c1.model = "Harrier";
		c1.color = "Navy Blue";
		c1.companyName = "Tata";
		c1.engine = "Tata V8";
		
		System.out.println("Car model :"+ c1.model);
		System.out.println("Car color :"+ c1.color);
		System.out.println("Car Company Name :"+ c1.companyName);
		System.out.println("Engine Manufacture :"+c1.engine);
		
		c1.Engine(10000, 110, "Tata Company", true);
		
//		System.out.println();
		
	}

}

