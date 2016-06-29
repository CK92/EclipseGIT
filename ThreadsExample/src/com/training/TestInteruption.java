package com.training;

public class TestInteruption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example ex1 = new Example();
		ex1.start();
		ex1.interrupt();
		Example ex2 = new Example();
		
		ex2.start();
	}

}
