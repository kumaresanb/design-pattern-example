package com.evolvus.java.design.builder.pattern;

public class Computer {
	// required parameters
	private String ram;
	private String hdd;
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	
	private Computer(ComputerBuilder builder) {
		this.ram=builder.ram;
		this.hdd=builder.hdd;
		this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled=builder.isBluetoothEnabled;
	}
	
	//Builder class
	public static class ComputerBuilder{
		
		// required parameters
		private String ram;
		private String hdd;
		
		//optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String ram,String hdd) {
			this.ram=ram;
			this.hdd=hdd;
		}
		
		public 	ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled=isGraphicsCardEnabled;
			return this;
		}
		
		public 	ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled=isBluetoothEnabled;
			return this;
		}
		
		public Computer bulid() {
			return new Computer(this);
		}
	}

	/**
	 * @return the ram
	 */
	public String getRam() {
		return ram;
	}

	/**
	 * @param ram
	 *            the ram to set
	 */
	public void setRam(String ram) {
		this.ram = ram;
	}

	/**
	 * @return the hdd
	 */
	public String getHdd() {
		return hdd;
	}

	/**
	 * @param hdd
	 *            the hdd to set
	 */
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	
	/**
	 * @return the isGraphicsCardEnabled
	 */
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	/**
	 * @param isGraphicsCardEnabled
	 *            the isGraphicsCardEnabled to set
	 */
	public void setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
	}

	/**
	 * @return the isBluetoothEnabled
	 */
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	/**
	 * @param isBluetoothEnabled
	 *            the isBluetoothEnabled to set
	 */
	public void setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

}
