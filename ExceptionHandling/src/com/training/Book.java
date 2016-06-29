package com.training;

public class Book {

	private int bookNumber;
	private String bookName;
	private double price;
	
	
	public Book() {
		super();
	}


	
	// THROWS : declaring
	public Book(int bookNumber, String bookName, double price) throws Exception{
		super();
		
		if(bookNumber < 100 || bookNumber > 1000)
		{
			throw new Exception("Book Number should be 100 - 1000");
		}
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.price = price;
	}


	public int getBookNumber() {
		return bookNumber;
	}


	//TRY CATCH : handling
	public void setBookNumber(int bookNumber) {      
		if(bookNumber < 100 || bookNumber > 1000)    // no pre-defined exceptions present for this.
		{
			//throw new RuntimeException("Book Number should be 100 - 1000");  Unchecked Exception
			
			try{
				throw new Exception ("Book Number should be 100 - 1000") ;
			}catch (Exception e){
				System.out.println("Book Number Error"+ e.getMessage());
			}
		}
		this.bookNumber = bookNumber;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}



	



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.bookNumber;
	}
	
	@Override
	public boolean equals(Object obj){
		// TODO Auto-generated method stub
		if(this == obj)     // same location
			return true;
		if(obj == null)
			return false;
		if(getClass()!=obj.getClass())   // same class
			return false;
		
		Book bk = (Book)obj;
		return bk.bookNumber == this.bookNumber &&
				bk.price == this.price &&
				bk.bookName.equals(this.bookName);
		
		
	}
	
	
}
