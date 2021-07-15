package br.com.designpattern.factory;

public class CarRent extends Rent {

	@Override
	protected Vehicle createVehicleRent() {
		
		return new Car();
	}

}
