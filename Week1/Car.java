package Week1;

import java.util.Scanner;

public class Car {
	int numberOfPassenger;
	int numberOfKms;
	
	public Car(){};
	
	public Car(int numberOfPassenger, int numberOfKms) {
		super();
		this.numberOfPassenger = numberOfPassenger;
		this.numberOfKms = numberOfKms;
	}
	
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
	
	
}

class Sedan extends Car{
	final int farePerKm =20;
}

class HatchBack extends Car{
	final int farePerKm =15;
}

class Ola {
	public Car bookCar(int numberOfPassenger) {
		
		Sedan sd = new Sedan();
		HatchBack hb = new HatchBack();
		
		if(numberOfPassenger <= 3) {
			return hb;
		}else {
			return sd;
		}
		
	}

	public int calculateBill(Car car,int numberOfPassenger, int numberOfKMs) {
		
		Sedan sd = new Sedan();
		HatchBack hb = new HatchBack();
		
		if(numberOfPassenger <= 3) {

			int totalFare = numberOfKMs*hb.farePerKm;
			return totalFare;
			
			}else {

			int totalFare = numberOfKMs*sd.farePerKm;
			return totalFare;
		}
		
	}
}

class Main{
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Car car = new Car();
		
		System.out.println(" Type number Of Passenger :");
		car.setNumberOfPassenger(scanner.nextInt());
		System.out.println(" Type number Of Kms : ");
		car.setNumberOfKms(scanner.nextInt());
		
		Ola myOla = new Ola();
		Car myCar = myOla.bookCar(car.getNumberOfPassenger());
		
		int res = myOla.calculateBill(myCar ,car.getNumberOfPassenger(), car.getNumberOfKms());

		System.out.println("The total fare amount is "+ res);
		
		
		}
}
