package br.com.designpattern.abstractfactory.equipment;

import br.com.designpattern.abstractfactory.AbstractFactory;

public class EquipmentFactory implements AbstractFactory<Equipment> {

	@Override
	public Equipment createFactory(String EquipmentType) {
		switch(EquipmentType) {
			case "Electric": 
				return new Electric();	
		case "Pneumatic": 
				return new Pneumatic();
			default: 
				return null;
		}
	}

}
