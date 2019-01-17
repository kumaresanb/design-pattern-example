package com.evolvus.java.design.singleton.pattern;

public class EgerIntializedSingleton {
	
	private static final EgerIntializedSingleton instance=new EgerIntializedSingleton();
	
	private EgerIntializedSingleton() {
		
	}
	
	public static EgerIntializedSingleton getInstance() {
		return instance;
	}
	

}
