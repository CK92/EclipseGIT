package com.training;

public class ExampleForJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main starting");
		
		Thread info = new ReadInfo();
		info.start();
		
		try{
		info.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(info.isAlive());
		
		System.out.println("Main Finished");
	}

}
