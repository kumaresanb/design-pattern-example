package com.evolvus.java.design.singleton.pattern;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {

	}

	//static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occcurd in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}

}
