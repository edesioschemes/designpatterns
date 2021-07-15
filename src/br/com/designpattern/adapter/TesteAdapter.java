package br.com.designpattern.adapter;

public class TesteAdapter {
	
	public static void main(String[] args) {
		
		CarSpeed mclaren = new McLaren();
		SpeedometerAdapter mclarenSpeed = new SpeedometerAdapterImpl(mclaren);

		System.out.println("Velocidade Mclaren: " + mclarenSpeed.getSpeedKm() + " Km");
		
		CarSpeed astonMartin = new AstonMartin();
		SpeedometerAdapter astonSpeed = new SpeedometerAdapterImpl(astonMartin);

		System.out.println("Velocidade Aston Martim: " + astonSpeed.getSpeedKm() + " Km");		
	}
	

}
