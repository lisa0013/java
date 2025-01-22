package com.Yedam;

import java.util.Scanner;

/*
 * 친구정보관리 앱 v.1
 * 이름,연락처,성별(남/여) => 홍길동, 010-1234-2345,남
 * 1.목록 (이름,연락처,성별) 2.등록 3.조회(성별) 4.삭제(이름) 9.종료
 * String[] friendAry 크기는 100개 ; forloop2 참고하고 while 등등 반복문 사용
 */

public class Todo2 {
	
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		
		String[] friendAry = new String[100]; 
//		friendAry[0] = "감자,010-1111-2222,남";
//		friendAry[1] = "양파,010-2222-3333,여";
//		friendAry[2] = "고구마,010-4444-5555,남";
		
			while(run) {
				System.out.println("1.목록 (이름,연락처,성별) 2.등록 3.조회(성별) 4.삭제(이름) 9.종료");
				int menu = Integer.parseInt(scn.nextLine());
					
					 switch(menu) {
					 
					  case 1: // 목록 출력(이름,연락처,성별)
						  for(int i = 0; i < friendAry.length; i++) {
							System.out.print("목록을 입력하세요.> ");
							friendAry[i] = scn.nextLine();
							}
							System.out.println("출력완료");
						  break;
				      case 2: // 등록
				    	  System.out.println("정보입력> exe)고구마,010-4444-5555,남");
				    	  String gender = scn.nextLine();
				    	  System.out.println("이름    연락처   성별");
				    	  System.out.println("등록완료");
				    	  for(int i = 0; i < friendAry.length; i++) {
								System.out.print("목록을 입력하세요.> ");
								friendAry[i] = scn.nextLine();
								}
								System.out.println("등록완료");
				    	  break;
				      case 3: // 조회(성별)
				    	  System.out.print("성별을 입력하세요.> ");
				    	  String name = scn.nextLine();
				    	  
				    	  for (int i = 0; i < friendAry.length; i++) {
								if (friendAry[i] == null) {
									friendAry[i] = name;
									break;
								}
							}

							for (int i = 0; i < friendAry.length; i++) {
								if (friendAry[i] != null) {
									System.out.println(friendAry[i]);

								}
							}
				    	  break;
				      case 4: // 삭제(이름)
				    	  break;
				      case 9: // 종료
				    	  break;
					 
					 
					 
					 
					 } // end of switch.
				
			} // end of while.
			System.out.print("end of prog.");
	} // end of main.
} // end of class.
