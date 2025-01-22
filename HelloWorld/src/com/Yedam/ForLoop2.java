package com.Yedam;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
//		String[] infoAry = "홍길동,80".split(",");
//		System.out.println(infoAry[0]);
//		System.out.println(infoAry[1]);
//		System.out.println(Integer.parseInt(infoAry[1]);

//		String[] strAry = new String[10];
//	    strAry[0] = "홍길동";
//	    String name = "김길동";
//	    for (int i = 0; i <strAry.length; i++) {
//	    	if(strAry[i] == null) { // 빈공간에 등록 후 반복문 종료
//	    		strAry[i] = name;
//	    		break;
//	    	}
//	    }
//	    
//	    for (int i = 0; i <strAry.length; i++) {
//	    	if(strAry[i] != null) {
//	    		System.out.print(strAry[i]);
//	    		
//	    	}
//	    }
		Scanner scn = new Scanner(System.in);
//		System.out.print("이름 입력> ");
//		String searchName = scn.nextLine();
//		System.out.println("박우식".equals(searchName)); // "박우식" == searchName

		String[] studentAry = new String[100]; // {"","",""}
		studentAry[0] = "홍길동,80";
		studentAry[1] = "김민수,70";
		studentAry[2] = "박우식,85";

		boolean run = true;

		while (run) {
			System.out.println("1.학생이름,점수 2.최고점수 3.학생입력(단건) 4.점수조회(이름) 9.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 학생이름, 점수
				for (int i = 0; i < studentAry.length; i++) {
					System.out.print("이름과 점수를 입력하세요.>> ex)홍길동,85 ");
					studentAry[i] = scn.nextLine();
				}
				System.out.println("등록완료!");
				break;

			case 2: // 최고점수 출력
				int max = 0;
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) { // null이 아닐 경우(값이 있을 경우)
						int tmep = Integer.parseInt(studentAry[i].split(",")[1]);
						if (max < tmep) {
							max = tmep;
						}
					}
				}
				System.out.printf("최고점수는 %d입니다.\n", max);
				break;

			case 3: // 한건씩 입력하기
				System.out.print("이름과 점수를 입력하세요.>> ex)홍길동,85 ");
				String name = scn.nextLine();
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] == null) {
						studentAry[i] = name;
						break;
					}
				}

				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) {
						System.out.println(studentAry[i]);

					}
				}
				break;
			case 4:
				System.out.print("이름을 입력하세요.");
				String searchName = scn.nextLine();		
				
				for (int i = 0; i < studentAry.length; i++) {
				  if(studentAry[i] != null) {
					if(studentAry[i].split(",")[0].equals(searchName)) {
						System.out.printf("점수는 %d입니다.\n", 
								studentAry[i].split(",")[0],
								studentAry[i].split(",")[1]);
						break; // for구문의 break;
					}
				  }
				}
				break; // switch구문의 
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}

		} // end of while.

		System.out.println("end of prog.");

	} // end of main.

} // end of class.
