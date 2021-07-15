package br.com.designpattern.builder;

public class Director {

	public void suvBuilder(Builder builder) {
		builder.setAbs(true);
		builder.setModelGPS("Universal");
		builder.setNumberAirBags(7);
		builder.setOffRoadPackage("Full");
	}
	
	public void premiumBuilder(Builder builder) {
		builder.setAbs(true);
		builder.setModelGPS("Standard");
		builder.setNumberAirBags(2);	
	}
	
	public void cityBuilder(Builder builder) {
		builder.setAbs(true);	
	}	
}
