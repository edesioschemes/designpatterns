package br.com.designpattern.bridge.payment;

public class DebitCard implements Payment {

	@Override
	public String getPaymentType() {
		return "Debit Card";
	}

}
