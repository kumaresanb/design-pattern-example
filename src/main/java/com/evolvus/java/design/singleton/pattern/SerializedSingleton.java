package com.evolvus.java.design.singleton.pattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7656596611146601202L;

	private SerializedSingleton() {

	}

	private static class SingletonHelper {
		private static final SerializedSingleton INSTANCE = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.INSTANCE;

	}
	
	protected Object readResolve() {
		return getInstance();
	}

}
