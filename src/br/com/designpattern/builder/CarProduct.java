package br.com.designpattern.builder;

public class CarProduct {

	private String carBrand;
	private String engine;
	private Integer numberSeats;
	private Integer numberAirBags;
	private Boolean abs;
	private String modelGps;
	private String offRoadPackage;
	
	public CarProduct(String carBrand, String engine, Integer numberSeats, Integer numberAirBags, Boolean abs,
			String modelGps, String offRoadPackage) {
		this.carBrand = carBrand;
		this.engine = engine;
		this.numberSeats = numberSeats;
		this.numberAirBags = numberAirBags;
		this.abs = abs;
		this.modelGps = modelGps;
		this.offRoadPackage = offRoadPackage;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public String getEngine() {
		return engine;
	}

	public Integer getNumberSeats() {
		return numberSeats;
	}

	public Integer getNumberAirBags() {
		return numberAirBags;
	}

	public Boolean getAbs() {
		return abs;
	}

	public String getModelGps() {
		return modelGps;
	}

	public String getOffRoadPackage() {
		return offRoadPackage;
	}
	
}
