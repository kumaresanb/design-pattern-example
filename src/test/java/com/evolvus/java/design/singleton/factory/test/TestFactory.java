package com.evolvus.java.design.singleton.factory.test;

import com.evolvus.java.design.factory.pattern.Computer;
import com.evolvus.java.design.factory.pattern.ComputerFactory;

public class TestFactory {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC", "32GB", "500GB", "8CORE");

		Computer server = ComputerFactory.getComputer("Server", "64GB", "2TB", "16CORE");

		System.out.println("Factory PC config:" + pc);

		System.out.println("Factory Server config:" + server);
	}
}
