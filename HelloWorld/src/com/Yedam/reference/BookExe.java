package com.Yedam.reference;

/*
 * << 도서명, 저자, 출판사, 판매가격 >>
 */
import java.util.Scanner;

public class BookExe {
	

	// 1.전체목록 2.도서등록 3.조회(출판사) 9.종료
	public static void main(String[] args) {
		
		
		
		
		
		
		Book 어린왕자 = new Book("사공웅","123","123",111);
		어린왕자.setYear("2022");
		어린왕자.getYear();
		어린왕자.name= "사공웅";
		
		Book 백설공주 = new Book();
		String name2 = 백설공주.name;
		

		
		
		
		int[] as = new int[10];
		as[0] = 1;
		
		Book[] bookRepository = new Book[100];
		// 초기데이터.
//		bookRepository[0] = new Book("이것이자바다","신용권","한빛미디어",30000);

		bookRepository[0] = new Book("바나나", "원숭이", "동물의왕국", 18000);
		bookRepository[1] = new Book("단무지", "김밥", "김밥천국", 15000);
		bookRepository[2] = new Book("프로틴", "건강", "헬스케어", 32000);
		
		
		
		
		
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 4.금액수정 5.상세조회 9.종료");
			System.out.println("메뉴를 선택하세요.");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {

			case 1: // 목록출력. 도서명, 저자, 가격
				System.out.println("도서명    저자     가격");
				System.out.println("===================");
				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] != null) {
						System.out.println(bookRepository[i].showBookInfo());
					}
				}
				System.out.println("===================");
				break;

			case 2: // 입력.
				// 등록하기.
				System.out.println("도서명 입력>>");
				String name = scn.nextLine();

				System.out.println("저자 입력>>");
				String aut = scn.nextLine();

				System.out.println("출판사 입력>>");
				String pub = scn.nextLine();

				System.out.println("가격 입력>>");
				int price = Integer.parseInt(scn.nextLine());

				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] == null) {
						bookRepository[i] = new Book(name, aut, pub, price);
						System.out.println("등록완료.");
						break; // for 종료.
					}

				}
				break; // switch case 종료.

			case 3: // 조회(출판사).
				System.out.println("출판사 입력>>");
				pub = scn.nextLine();

				System.out.println("도서명    저자     가격");
				System.out.println("===================");

				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] != null && //
							bookRepository[i].getPubName().equals(pub)) {
						System.out.println(bookRepository[i].showBookInfo());
					}
				}
				System.out.println("===================");
				break;

			case 4: // 수정.
				System.out.println("도서명 입력>>");
				name = scn.nextLine();
				System.out.println("가격 입력>>");
				price = Integer.parseInt(scn.nextLine());
				// 도서명으로 검색 => 입력값으로 필드변경.
				boolean isExist = false; //
				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] != null && //
							bookRepository[i].getBookName().equals(name)) {
						bookRepository[i].setBookPrice(price);
						System.out.println("수정완료.");
						isExist = true;
						break; // 수정완료되면 반복문 종료.
					}
				} // end of for.
				if (!isExist) {
					System.out.println("찾는 도서가 없습니다.");
				}
				break;
				
			case 5: // 상세조회.
				System.out.println("도서명 입력>>");
				name = scn.nextLine();
				for(int i = 0; i < bookRepository.length; i++) {
					if(bookRepository[i] != null &&//
							bookRepository[i].getBookName().equals(name)) {
						bookRepository[i].showDetailInfo(); // 상세출력.
						break;
					}
				}
				System.out.println("============================");
				break;
				
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");

			} // end of switch.
		} // end of while.
	} // end of main.
} // end of class.
