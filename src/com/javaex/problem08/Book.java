package com.javaex.problem08;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	private String Code;
	
	public Book(int bookNo,String title,String author) {
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		stateCode=1;
		Code="재고있음";
				
	}
    
	public int bookNo() {
    	return bookNo;
	}
    
    public String title() {
    	return title;
    }
    
    public String author() {
    	return author;
    }
    
    public void stateCode(int state) {
    	stateCode=state;
    }
    
    public void rent() {
    	stateCode=0;
    }
    
    public void Book(int bookNo,String title,String author) {
    	
    }
    public void rent(int bookNo,Book books)
    {
    	books.stateCode(0);
    	
    }
    
    public void print() {
    	if(stateCode==1)
    		System.out.println("재고있음");
    	else
    		System.out.println("대여중");
    }
    
}
