package com.Yedam.reference;

public class Book {
	// 필드(속성): 도서명, 저자, 출판사, 판매가격. 정보를 담을수 있는 게 필드
	String bookName;
	String autName;
	String pubName;
	int bookPrice;

	Book() {
	}

	Book(String bookName, String autName, String pubName, int bookPrice) {
		this.bookName = bookName;
		this.autName = autName;
		this.pubName = autName;
		this.bookPrice = bookPrice;
	}
}
