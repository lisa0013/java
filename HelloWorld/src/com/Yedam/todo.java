package com.Yedam;

import java.util.Scanner;

// com.yedam.todo
public class todo {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		
		while (true) {
			System.out.println("1.입금 2.출금 3.잔액조회 4.종료");
			System.out.println("메뉴를 선택하세요");
			int num =Integer.parseInt(scn.nextLine()); 
			
			if (num == 1) { // 입금.
				System.out.println("금액을 입력>");
				balance = Integer.parseInt(scn.nextLine());
				
			} else if (num == 2) { // 출금.
				
			} else if (num == 3) { // 잔액조회.
				System.out.printf("현재 잔액은 %d입니다.\n", balance);
			}else if (num == 4) { // 종료.
				
			}
			
		}
//			System.out.printf("end of prog\n");
	}
}
