package br.com.designpattern.abstractfactory;

import br.com.designpattern.abstractfactory.equipment.Equipment;
import br.com.designpattern.abstractfactory.vehicle.Vehicle;

public class TesteAbstractFactory {

	public static void main(String[] args) {
		
		AbstractFactory abstractFactory;
		
		abstractFactory = FactoryProvider.getFactory("Vehicle");
		Vehicle equipment =  (Vehicle) abstractFactory.createFactory("Car");
		
		equipment.startRent();
		

	}

}
