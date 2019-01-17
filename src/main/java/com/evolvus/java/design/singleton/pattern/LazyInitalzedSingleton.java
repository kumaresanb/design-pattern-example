package com.evolvus.java.design.singleton.pattern;

public class LazyInitalzedSingleton {
	
	private static LazyInitalzedSingleton instance;
	
	private LazyInitalzedSingleton() {
	
	}
	
	public static LazyInitalzedSingleton getInatance() {
		if(instance==null) {
			instance=new LazyInitalzedSingleton();
		}
		return instance;
	}

}
