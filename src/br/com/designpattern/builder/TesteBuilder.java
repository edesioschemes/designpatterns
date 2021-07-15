package br.com.designpattern.builder;

public class TesteBuilder {

	public static void main(String[] args) {
		
		Director director = new Director();
		
		SuvCarBuilder suvCar = new SuvCarBuilder("Ford", "3.5 Turbo", 7);
		director.suvBuilder(suvCar);

		PremiumCarBuilder premiumCar = new PremiumCarBuilder("GM", "2.0 Turbo", 5);
		director.premiumBuilder(premiumCar);
		
		CityCarBuilder cityCar = new CityCarBuilder("Fiat", "1.0", 7);
		director.cityBuilder(cityCar);		
		
	}

}
