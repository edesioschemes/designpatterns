package br.com.designpattern.bridge.payment;

public class Money implements Payment {

	@Override
	public String getPaymentType() {
		
		return "Money";
	}

}
