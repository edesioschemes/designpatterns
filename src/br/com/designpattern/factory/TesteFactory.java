package br.com.designpattern.factory;

public class TesteFactory{

	private static Rent rent;
	
	public static void main(String[] args) {
		
		String typeRent = "Car";
		
		switch(typeRent) {
			case "Car": 
				rent = new CarRent();
				break;
			case "Truck": 
				rent = new TruckRent();
				break;
			case "Moto": 
				rent = new MotorCycleRent();
				break;
			default: 
				System.out.println("Erro");
		}
		
		if (rent != null) {
			rent.startRent();
		}

	}

}
