package com.Yedam;

import java.util.Scanner;

/* 친구 정보 관리
 * 이름, 연락처, 성별
 * 1. 목록
 * 2. 등록
 * 3. 조회(성별)
 * 4. 삭제
 * 5. 연락처 수정
 * 9. 종료
 */
public class Todo2 {

	public static void main(String[] args) {

		String[] friendAry = new String[100];
		friendAry[0] = "김민식,111,남";
		friendAry[1] = "김민서,111,여";
		friendAry[2] = "김민식,111,남";
		friendAry[3] = "김민서,111,여";
		friendAry[4] = "김민식,111,남";
		friendAry[5] = "김민수,111,여";
		friendAry[6] = "김민성,111,남";
		friendAry[7] = "김민서,111,여";
		friendAry[8] = "김민성,111,남";
		friendAry[9] = "김민수,111,여";
		friendAry[10] = "김민성,111,남";
		friendAry[11] = "김민수,111,여";

		Scanner scn = new Scanner(System.in);

		boolean run = true;

		while (run) {

			System.out.println("1.목록 2.등록 3.조회(성별) 4.삭제 5.연락처수정 9.종료");
			System.out.println("메뉴를 선택하세요.");

			int menu = Integer.parseInt(scn.nextLine());

			// 동명이인 처리
			// 목록 페이지 처리
			switch (menu) {
			case 1:

				boolean print = true;

				int page = 0;
				int count = 0;
				int max = 5;
				int index = 0;
				
				while (print) {
					page++;
					
					System.out.println("=================");
					System.out.printf("%d 페이지\n", page);
					for (int i = index + 1; i < friendAry.length; i++) {
						index = i;
						if (friendAry[i] != null) {
							System.out.println(friendAry[i] + "," + i);
							count++;
						}
						if (count == max || i == (friendAry.length - 1)) {
							count = 0;
							break;
						}
					}

					System.out.println("=================");
					System.out.println("계속: 1, 종료: 0");
					int check = Integer.parseInt(scn.nextLine());
					if (check == 0) {
						print = false;
					}
				};

//				int count = 0;
//				
//				String[] temp = new String[5];
//				
//				for (int i = 0; i < 5; i ++) {
//					if (friendAry[i] != null) {
//						temp[count] = friendAry[i];
//						count++;
//					}
//					if (count == 5) {
//						break;
//					}
//				}
//				
//				for (String item: temp) {
//					System.out.println(item);
//				}

				break;
			case 2:
				System.out.println("친구 정보를 입력하세요. (이름,전화번호,성별)");
				String friend = scn.nextLine();

				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] == null) {
						friendAry[i] = friend;
						break;
					}
				}
				break;
			case 3:
				System.out.println("조회할 정보를 입력하세요. (남/여)");
				String gender = scn.nextLine();

				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null && friendAry[i].split(",")[2].equals(gender)) {
						System.out.println(friendAry[i]);
					}
				}
				break;
			case 4:
				System.out.println("삭제할 정보를 입력하세요. (이름)");
				String nameRemove = scn.nextLine();

				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null && friendAry[i].split(",")[0].equals(nameRemove)) {
						friendAry[i] = null;
					}
				}
				break;
			case 5:
				System.out.println("수정할 대상의 정보를 입력하세요. (이름)");
				String nameEdit = scn.nextLine();

				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null && friendAry[i].split(",")[0].equals(nameEdit)) {
						System.out.println("수정할 정보를 입력하세요. (연락처)");
						String telEdit = scn.nextLine();

						String friendEdit = friendAry[i].split(",")[0] + "," + telEdit + ","
								+ friendAry[i].split(",")[2];
						friendAry[i] = friendEdit;
					}
				}
				break;
			case 9:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			} // switch
		} // while
	} // main
} // class

