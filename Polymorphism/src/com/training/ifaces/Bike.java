package com.training.ifaces;

public class Bike implements Automobile {

	/* returns price .(non-Javadoc)
	 * @see com.training.ifaces.Automobile#getPrice()
	 */
	
	@Override
	public double getPrice(){
		// TODO Auto-generated method stub
		return 500000;
	}

	
	/*
	 * returns color.
	 * (non-Javadoc)
	 * @see com.training.ifaces.Automobile#getColor()
	 */
	
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "BLUE";
	}

	
	/* returns model.
	 * (non-Javadoc)
	 * @see com.training.ifaces.Automobile#getModel()
	 */
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "DISCOVER 125";
	}

}
