package br.com.designpattern.adapter;

public class SpeedometerAdapterImpl implements SpeedometerAdapter {
	
	private CarSpeed carSpeed;
	
	public SpeedometerAdapterImpl(CarSpeed carSpeed) {
		this.carSpeed = carSpeed;
	}

	@Override
	public double getSpeedKm() {
		double mph = carSpeed.getSpeed();
		return convertMptoKm(mph);
	}
	
    private double convertMptoKm(double mph) {
        return mph * 1.60934;
    }	

}
