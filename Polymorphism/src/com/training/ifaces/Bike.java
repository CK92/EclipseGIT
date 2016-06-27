package com.training.ifaces;

public class Bike implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500000;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "BLUE";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "DISCOVER 125";
	}

}
