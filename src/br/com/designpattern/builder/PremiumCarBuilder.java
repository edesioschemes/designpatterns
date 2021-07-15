package br.com.designpattern.builder;

public class PremiumCarBuilder implements Builder {

	private String carBrand;
	private String engine;
	private Integer numberSeats;
	private Integer numberAirBags;
	private Boolean abs;
	private String modelGps;	
	
	public PremiumCarBuilder(String carBrand, String engine, Integer numberSeats ) {
		this.carBrand = carBrand;
		this.engine = engine;
		this.numberSeats = numberSeats;
	}

	@Override
	public void setNumberAirBags(Integer numberAirBags) {
		this.numberAirBags = numberAirBags;
	}

	@Override
	public void setAbs(Boolean abs) {
		this.abs = abs;
	}

	@Override
	public void setModelGPS(String modelGps) {
		this.modelGps = modelGps;
	}

	@Override
	public void setOffRoadPackage(String offRoadPackage) {
	
	}
	
	public CarProduct build() {
		return new CarProduct(carBrand, engine, numberSeats, numberAirBags, abs, modelGps, null);
	}
}
