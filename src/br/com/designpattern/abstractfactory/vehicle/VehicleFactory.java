package br.com.designpattern.abstractfactory.vehicle;

import br.com.designpattern.abstractfactory.AbstractFactory;

public class VehicleFactory implements AbstractFactory<Vehicle> {

	@Override
	public Vehicle createFactory(String vehicleType) {
		switch(vehicleType) {
			case "Car": 
				return new Car();				
			case "Truck": 
				return new Truck();
			case "Moto": 
				return new Motorcycle();
			default: 
				return null;
		}
	}

}
