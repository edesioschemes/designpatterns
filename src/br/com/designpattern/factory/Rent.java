package br.com.designpattern.factory;

public abstract class Rent {

	void startRent() {
		Vehicle vehicle = createVehicleRent();
		vehicle.startRent();
	}
	
	protected abstract Vehicle createVehicleRent();
	
}
