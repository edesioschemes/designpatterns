package br.com.designpattern.abstractfactory.equipment;

public class Electric implements Equipment {

	String type;
	Integer voltage;
	Integer watts;
	Integer ampere;
	
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
		return "Equipamento Elétrico";
	}

	@Override
	public Integer getLifeCicle() {
		return 2;
	}

}
