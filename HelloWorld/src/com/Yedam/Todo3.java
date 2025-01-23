package com.Yedam;

import java.util.Scanner;

public class Todo3 {

	public static void main(String[] args) {

		String[][] friends = new String[100][3];

		friends[0][0] = "홍길동";
		friends[0][1] = "111111";
		friends[0][2] = "남";

		friends[1] = new String[] { "김민서", "222222", "여" };

		friends[2][0] = "홍길순";
		friends[2][1] = "333333";
		friends[2][2] = "여";

		friends[3][0] = "홍길수";
		friends[3][1] = "444444";
		friends[3][2] = "남";

		Scanner scn = new Scanner(System.in);

		boolean run = true;

		while (run) {

			System.out.println("1.목록 2.등록 3.조회(성별) 4.삭제 5.연락처수정 9.종료");
			System.out.println("메뉴를 선택하세요.");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				System.out.println("========>");
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i][0] != null) {
						System.out.printf("이름: %s, 전화번호: %s, 성별: %s\n", friends[i][0], friends[i][1], friends[i][2]);
					}
				}
				System.out.println("<========");
				break;
			case 2:
				System.out.println("이름 입력");
				String name_in = scn.nextLine();

				// 중복 이름 확인
//				int count = 0;
//
//				for (String[] friend : friends) {
//					if (name_in.equals(friend[0])) {
//						count++;
//					}
//				}
//
//				if (count != 0) {
//					System.out.printf("같은 이름이 %d명 존재합니다. 등록할까요?\n", count);
//					System.out.println("1: 계속, 0: 종료");
//					int check = Integer.parseInt(scn.nextLine());
//					if (check != 1) {
//						break;
//					}
//				}

				System.out.println("전화번호 입력");
				String phone_in = scn.nextLine();
				System.out.println("성별 입력");
				String gender_in = scn.nextLine();

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i][0] == null) {
						friends[i][0] = name_in;
						friends[i][1] = phone_in;
						friends[i][2] = gender_in;
						break;
					}
				}
				System.out.println("입력 완료");
				break;
			case 3:
				System.out.println("조회할 정보를 입력하세요. (남/여)");
				String gender = scn.nextLine();

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && gender.equals(friends[i][2])) {
						System.out.printf("이름: %s, 전화번호: %s, 성별: %s\n", friends[i][0], friends[i][1], friends[i][2]);
					}
				}
				break;
			case 4:
				System.out.println("삭제할 정보를 입력하세요. (이름)");
				String name_remove = scn.nextLine();

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && name_remove.equals(friends[i][0])) {
						friends[i][0] = null;
						friends[i][1] = null;
						friends[i][2] = null;
					}
				}
				break;
			case 5:
				System.out.println("수정할 대상의 정보를 입력하세요. (이름)");
				String name_edit = scn.nextLine();

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && name_edit.equals(friends[i][0])) {
						System.out.println("수정할 정보를 입력하세요. (연락처)");
						String phone_edit = scn.nextLine();

						friends[i][1] = phone_edit;
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
