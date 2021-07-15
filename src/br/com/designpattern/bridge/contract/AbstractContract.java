package br.com.designpattern.bridge.contract;

import br.com.designpattern.bridge.payment.Payment;

public abstract class AbstractContract {

	protected Payment payment;	
	
	public AbstractContract(Payment payment) {
		this.payment = payment;
	}

	abstract public void signContract();
	
}
