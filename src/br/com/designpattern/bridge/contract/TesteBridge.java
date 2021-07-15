package br.com.designpattern.bridge.contract;

import br.com.designpattern.bridge.payment.CreditCard;

public class TesteBridge {

	public static void main(String[] args) {
		PersonalContract personalContract = new PersonalContract(new CreditCard());
		personalContract.signContract();

	}

}
