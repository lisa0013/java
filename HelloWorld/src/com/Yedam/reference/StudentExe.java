package com.Yedam.reference;

import java.util.Scanner;

public class StudentExe {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		
		final Student std1 = new Student(); // 인스턴스 생성.
		std1.studentName = "홍길동";
		std1.engScore = 80;
		std1.mathScore = 85;
		std1.gender = Gender.MEN;
//		std1 = new Student("Hong", 88); // 새로운 인스턴스 대입 불가.
		
		Student std2 = new Student();
		std2.studentName = "김민수";
		std2.engScore = 85;
		std2.mathScore = 88;
		std2.gender = Gender.MEN;
		
		Student std3 = new Student();
		std3.studentName = "감자빵";
		std3.engScore = 75;
		std3.mathScore = 90;
		std3.gender = Gender.WOMEN;
		
		
		students[0] = std1;
		students[1] = std2;
		students[2] = std3;
		students[3] = new Student("양파빵", 88, 92);
		
		// 학생의 이름을 입력받는 변수: studName감
		// 학생의 평균을 출력하는 프로그램을 작성.
		
		Scanner scn = new Scanner(System.in);
//		System.out.print("학생의 이름을 입력하세요.");
//		String studName = scn.nextLine();
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null && students[i].gender == Gender.MEN) {
				students[i].printInfo();
			}	
//			if(students[i] != null && students[i].getAverage() >= 85) {
//				students[i].printInfo();
//			}
//			if(students[i] != null && students[i].studentName.equals(studName)) {
//				System.out.printf("학생의 평균은 %.2f입니다.\n", students[i].getAverage());
//			}
			
			
		}
		
	}
}
