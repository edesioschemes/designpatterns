package br.com.designpattern.abstractfactory.equipment;

public class Pneumatic implements Equipment {

	Integer airPower;
	Integer armsExtension;
	Integer springPower;
	
	@Override
	public void startRent() {
		getContract();
		System.out.println(getSpecification());
		System.out.println(getLifeCicle() + " anos");
		
		System.out.println("Iniciando o aluguel do equipamento");
	}

	@Override
	public void getContract() {
		System.out.println("Contrato assinado");
	}

	@Override
	public String getSpecification() {
		return "Equipamento Pneumatico";
	}

	@Override
	public Integer getLifeCicle() {
		return 5;
	}

}
