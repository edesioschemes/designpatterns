package br.com.designpattern.factory;

public class MotorCycleRent extends Rent {

	@Override
	protected Vehicle createVehicleRent() {
		
		return new Motorcycle();
	}

}
