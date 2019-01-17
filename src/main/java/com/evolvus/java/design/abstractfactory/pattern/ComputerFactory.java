package com.evolvus.java.design.abstractfactory.pattern;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}

}
