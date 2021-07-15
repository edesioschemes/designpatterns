package br.com.designpattern.builder;

public class CityCarBuilder implements Builder {

	private String carBrand;
	private String engine;
	private Integer numberSeats;
	private Boolean abs;
	
	public CityCarBuilder(String carBrand, String engine, Integer numberSeats ) {
		this.carBrand = carBrand;
		this.engine = engine;
		this.numberSeats = numberSeats;
	}

	@Override
	public void setNumberAirBags(Integer numberAirBags) {
	}

	@Override
	public void setAbs(Boolean abs) {
		this.abs = abs;
	}

	@Override
	public void setModelGPS(String modelGps) {
	}

	@Override
	public void setOffRoadPackage(String offRoadPackage) {		
	}
	
	public CarProduct build() {
		return new CarProduct(carBrand, engine, numberSeats, 2, true, null, null);
	}	
	
}
