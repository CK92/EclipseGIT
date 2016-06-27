package com.training;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 49;
		
		
		try{
			int den = Integer.parseInt(args[0]);
			System.out.println(num/den);
		} catch (ArithmeticException e){
			System.err.println("Exception - Denominator ZERO");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Pass Command Line Argument");
		}
		catch(Exception e)
		{
			System.out.println("May be invalid Command line Arguement");
		}
	}

}
