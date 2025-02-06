package com.Yedam.interfaces.emp;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 사원관리 App v.1
 * 실행클래스: MainExe
 * 인터페이스 활용. (배열, 컬렉션)
 * Employee, EmpAryExe, EmpListExe, EmpDAO(인터페이스)
 */
public class MainExe {
	// 스캐너.
	static Scanner scn = new Scanner(System.in);
	
	// 컬렉션.
	static EmpDAO dao = new EmpListExe();
	
	public static void main(String[] args) {
		// run.
		
		boolean run = true;

		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 9.종료");
			System.out.println("선택>> ");
			int menu = 0;

			try {
				menu = scn.nextInt();

			} catch (InputMismatchException e) {
				// 정상실행이 진행되도록 구성.
				System.out.println("메뉴를 확인하세요.");
				scn.nextLine();
				continue;
			}

			scn.nextLine();
			switch (menu) {
			case 1: // 추가. 사원번호, 이름, 전화번호.

				// NumberFormat 예외처리.
				int empNo = 0;
				while (true) {
					try {
						System.out.print("사원번호>> ");
						empNo = Integer.parseInt(scn.nextLine());
						break; // 정삭적인 값을 입력하면 while 종료.
					} catch (NumberFormatException e) {
						System.out.print("사원번호를 확인하세요.");
					}
				} // end of while.

				System.out.print("이름>> ");
				String eName = scn.nextLine();
				System.out.print("전화번호>> ");
				String tel = scn.nextLine();

				if (dao.registerEmp(new Employee(empNo, eName, tel))) {
					System.out.println("등록성공");
				}
				break; // end of case 1.

			case 2: // 수정항목: 전화번호, 입사일자, 급여. + 사원번호
				System.out.print("사원번호>> ");
				empNo = Integer.parseInt(scn.nextLine());
				System.out.print("전화번호>> ");
				tel = scn.nextLine();
				System.out.print("입사일자>> ");
				String hdate = scn.nextLine();
				System.out.print("급여>> ");
				int sal = Integer.parseInt(scn.nextLine());

				if (dao.modifyEmp(new Employee(empNo, "", tel, hdate, sal))) {
					System.out.println("수정완료");
				}
				break; // case 2 종료.
			case 3: // 삭제. 사원번호.
				try {
					remove();
				} catch (NumberFormatException e) {
					System.out.print("사원번호 확인");
				}
				break;

			case 4: // 목록.
				// 조회조건(급여 이상)
				System.out.print("조회 급여조건>> ");
				sal = Integer.parseInt(scn.nextLine());

				Employee emp = new Employee();
				emp.setSalary(sal);

				// 조회결과.
				Employee[] result = dao.search(emp);
				// 출력.
				System.out.println("사번   이름    연락처    급여");
				System.out.println("========================");
				for (Employee emp1 : result) {
					if (emp1 != null) {
						System.out.println(emp1.empInfo());
					}
				}
				break; // case 4.

			case 9:
				System.out.print("종료합니다.");
				run = false;
				break;
			default:
				System.out.print("메뉴를 확인하세요.");
			}

		} // end of while.
		System.out.println("end of prog.");
	} // end of main.
	
	// 예외 떠넘기기 예제.
	static void remove() throws NumberFormatException{
		System.out.print("사원번호>> ");
		int empNo = Integer.parseInt(scn.nextLine());

		if (dao.removeEmp(empNo)) {
			System.out.println("삭제완료");
		}
	} // end of remove.
} // end of class.
