package com.Yedam.reference;

public class Book {
	// 필드(속성): 도서명, 저자, 출판사, 판매가격. 정보를 담을수 있는 게 필드
	public String name = "";
	private String year = "2014";
	
	private String bookName;
	private String autName;
	private String pubName;
	private int bookPrice;
	
	
	
	// public, default, private => 접근제한자(access modifier)
	// 생성자. 필드값 초기화해줄 때 쓰는 생성자
	Book(String bookName, String autName, String pubName, int bookPrice) {
		this.bookName = bookName;
		this.autName = autName;
		this.pubName = pubName;
		this.bookPrice = bookPrice;
	}
	Book(){
		
	
	}
	
   public String getYear() {
	   return year;
   }
   
   public void setYear(String year) {
	   this.year = year; 
   }
	
	
	// 메소드. 제목, 저자, 가격
	String showBookInfo() {
		return bookName + "   " + autName + "   " + bookPrice;
	}
	void showDetailInfo() {
		// 도서명: 이것이 자바다      출판사: 한빛미디어
		// 저자: 신용권            가격: 25000원
		String strFormat = "도서명: %s\t출판사: %6s\n저 자: %3s\t가 격: %5d 원\n";
		System.out.printf(strFormat, bookName, pubName, autName, bookPrice);
		
		 
	}
	
	// setter
	void setBookPrice(int bookPrice) {
		if (bookPrice < 0 ) {
			this.bookPrice = 0;
			return;
		}
		this.bookPrice = bookPrice;
	}
	void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAutName(String autName) {
		this.autName = autName;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	
	// getter.
	public String getBookName() {
		return bookName;
	}
	public String getAutName() {
		return autName;
	}
	public String getPubName() {
		return pubName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	
}
