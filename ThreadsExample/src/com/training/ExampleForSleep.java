package com.training;

public class ExampleForSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		System.out.println("SBBB");
		Thread.sleep(700);
		System.out.println("Sapient");
		Thread.sleep(600);
		System.out.println("Brilliant");
		Thread.sleep(10000);
		System.out.println("Batch");
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

}
