package com.training;

// USING EXTENDING THREADCLASS

public class MyThread extends Thread{
	
	
	public MyThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void run(){
		for (int i=0;i<=10;i++)
		{
			
			System.out.println(i+" From Current Thread :="+ Thread.currentThread().getName());
			
		}
	}

}
