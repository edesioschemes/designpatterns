package br.com.designpattern.builder;

public class Car {

	public Car(String carType, String engine, Integer numberSeats, Integer numAirBag, Boolean abs, String gps) {
		
	}
	
	public static void main(String[] args) {
		Car car = new Car("sedan", "2.0 Turbo", 5, 2, true, "Original");
		
		Car car2 = new Car("sedan", "2.0 Turbo", 5, null, true, null);
	}
}

