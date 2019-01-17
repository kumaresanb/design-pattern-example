package com.evolvus.java.design.abstractfactory.pattern.test;

import com.evolvus.java.design.abstractfactory.pattern.Computer;
import com.evolvus.java.design.abstractfactory.pattern.ComputerFactory;
import com.evolvus.java.design.abstractfactory.pattern.PcFactory;
import com.evolvus.java.design.abstractfactory.pattern.ServerFactory;

public class TestDesignPatterns {
	
	public static void main(String[] args) {
		testAbstractFactory();
	}
	
	private static void testAbstractFactory() {
		Computer pc =ComputerFactory.getComputer(new PcFactory("8 GB","500 GB","4 core"));
		Computer server=ComputerFactory.getComputer(new ServerFactory("32 GB", "2 TB", "16 core"));
		
		System.out.println("AbstractFactory PC config::"+pc);
		
		System.out.println("AbstractFactory Server config::"+server);
	}

}
