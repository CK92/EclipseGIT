package com.training.ifaces;

public class NewShowRoom extends ShowRoom {

	@Override
	public Automobile getModel(int key) {
		// TODO Auto-generated method stub
		if (key==3){
			return new Bike();
		}
		else
		{
			return super.getModel(key);
		}
		
	}

	
	
}
