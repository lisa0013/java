package com.Yedam.reference;
/*
 * << 도서명, 저자, 출판사, 판매가격 >>
 */
import java.util.Scanner;
public class BookExe {
	// 1.전체목록 2.도서등록 3.조회(출판사) 9.종료
	public static void main(String[] args) {
		Book[] bookRepository = new Book[100];
		
		Book bk1 = new Book(); // 인스턴스 생성
		bk1.bookName = "바나나";
		bk1.autName = "원숭이";
		bk1.pubName = "동물의 왕국";
		bk1.bookPrice = 18000;
		
		Book bk2 = new Book(); 
		bk2.bookName = "단무지";
		bk2.autName = "김밥";
		bk2.pubName = "김밥 천국";
		bk2.bookPrice = 15000;
		
		Book bk3 = new Book(); 
		bk3.bookName = "프로틴";
		bk3.autName = "건강";
		bk3.pubName = "헬스케어";
		bk3.bookPrice = 32000;
		
		bookRepository[0] = bk1;
		bookRepository[1] = bk2;
		bookRepository[2] = bk3;
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 9.종료");
			System.out.println("메뉴를 선택하세요.");
			
			int menu = Integer.parseInt(scn.nextLine());
			
			
			switch (menu) {
			
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 9:
				break;
			
			
			
			
			
			} // end of switch.
		} // end of while.
	} // end of main.
} // end of class.
