package br.com.designpattern.factory;

public class Car implements Vehicle {

	String type;
	Integer carSeat;
	Integer numberBags;
	
	@Override
	public void startRent() {
		signContract();
		System.out.println("Iniciando o aluguel do carro");

	}

	@Override
	public void signContract() {
		System.out.println("Contrato assinado");
	}

}
