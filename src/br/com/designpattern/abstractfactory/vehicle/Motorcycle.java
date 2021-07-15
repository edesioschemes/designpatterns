package br.com.designpattern.abstractfactory.vehicle;

public class Motorcycle implements Vehicle {

	Integer powerHP;
	
	@Override
	public void startRent() {
		signContract();
		System.out.println("Iniciando o aluguel da motocicleta");

	}

	@Override
	public void signContract() {
		System.out.println("Contrato assinado");
	}
}
