package com.javaex.problem08;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	
	public Book(int bookNo,String title,String author) {
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		stateCode=1;
		
				
	}
    
	public int bookNo() {
    	return bookNo;
	}
    
	public void bookNo(int bookNo) {
    	this.bookNo=bookNo;
	}
	
    public String title() {
    	return title;
    }
    
    public void title(String title) {
    	this.title=title;
    }
    
    public String author() {
    	return author;	
    }
    
    public void author(String author) {
    	this.author=author;
    }
    
    public void stateCode(int state) {
    	stateCode=state;
    }
    
    public void rent() {
    	stateCode=0;
    	System.out.println(title+"이 대여 됐습니다.");
    }
    
 
    
    public void print() {
    	if(stateCode==1)
    		System.out.printf("%d 책 제목: %s, 작가:%s, 대여 유무: 재고있음\n",bookNo,title,author);
    	else
    		System.out.printf("%d 책 제목: %s, 작가:%s, 대여 유무: 대여중\n",bookNo,title,author);
    }
    
}
