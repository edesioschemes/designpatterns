package br.com.designpattern.abstractfactory.vehicle;

public class Truck implements Vehicle {

	Integer cabs;
	String typeTruck;
	Integer burden;
	
	@Override
	public void startRent() {
		signContract();
		System.out.println("Iniciando o aluguel do caminhão");

	}

	@Override
	public void signContract() {
		System.out.println("Contrato assinado");
	}

}
