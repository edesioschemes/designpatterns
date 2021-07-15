package br.com.designpattern.abstractfactory;

import br.com.designpattern.abstractfactory.equipment.EquipmentFactory;
import br.com.designpattern.abstractfactory.vehicle.VehicleFactory;

public class FactoryProvider {
	
	public static AbstractFactory getFactory(String rendType) {
		
		if ("Equipment".equalsIgnoreCase(rendType)){ 
			return new EquipmentFactory();
		}
		else if ("Vehicle".equalsIgnoreCase(rendType)){
			return new VehicleFactory();
			}
		return null;
	}
}
