package br.com.designpattern.bridge.contract;

import br.com.designpattern.bridge.payment.Payment;

public class PersonalContract extends AbstractContract {

	public PersonalContract(Payment payment) {
		super(payment);
	}
	
	@Override
	public void signContract() {
		System.out.println("Forma de pagamento do contrato: " + payment.getPaymentType());
	}

}
