package com.training;

public class Application4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Book bk1 = new Book(101,"Java",450.00);
			Book bk2 = new Book(101,"Java",450.00);
			System.out.println(bk1.equals(bk2));
			
			
			Book bk3 =bk2;
			System.out.println(bk3.equals(bk2));
			
			Book bk4 = null;
			System.out.println(bk1.equals(bk4));
			
			String name = new String("Ramesh");
			System.out.println(bk1.equals(name));
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
