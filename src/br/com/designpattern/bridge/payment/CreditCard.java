package br.com.designpattern.bridge.payment;

public class CreditCard implements Payment {

	@Override
	public String getPaymentType() {
		return "Credit Card";
	}

}
