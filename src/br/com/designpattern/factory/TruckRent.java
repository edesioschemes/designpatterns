package br.com.designpattern.factory;

public class TruckRent extends Rent {

	@Override
	protected Vehicle createVehicleRent() {
		
		return new Truck();
	}

}
