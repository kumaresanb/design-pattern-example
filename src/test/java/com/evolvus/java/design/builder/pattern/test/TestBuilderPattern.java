package com.evolvus.java.design.builder.pattern.test;

import com.evolvus.java.design.builder.pattern.Computer;

public class TestBuilderPattern {

	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and 
        //without any inconsistent state or arguments management issues
		
		Computer com = new Computer.ComputerBuilder("32 GB", "500 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(false).bulid();
		System.out.println("HDD:"+com.getHdd()+" "+"RAM:"+com.getRam());

	}

}
