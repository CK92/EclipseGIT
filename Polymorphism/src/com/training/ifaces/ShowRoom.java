package com.training.ifaces;


import com.training.ifaces.Automobile;
public class ShowRoom {
	
	
	public Automobile getModel(int key){
		
		switch (key){
		case 1:
			return new MarutiCar();
		case 2:
			return new ToyotaCar();
		default:
				return null;
				
		}
	}

	/*
	 * Method is used to print the Quotation of the vehic.les
	 */
	public void printQuote(Automobile polyAuto)
	{
		System.out.println(Automobile.SHOWROOM_NAME);
		
		System.out.println(polyAuto.getModel()); //Polymorphism
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getPrice());
	}
}
