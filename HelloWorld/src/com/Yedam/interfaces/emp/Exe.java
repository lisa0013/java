package com.Yedam.interfaces.emp;

import java.util.ArrayList; // 클래스.
import java.util.List; // 인터페이스.

import com.Yedam.ingeritance.ComFriend;
import com.Yedam.ingeritance.Friend;
import com.Yedam.reference.Student;

/*
 * String[] strAry;
 * Collection 1) List 2) Set 3) Map
 */
public class Exe {
	public static void main(String[] args) {
		// 학생정보를 저장하는 컬렉션(ArrayList) 선언.
		// 3명 추가.
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("둘리", 99, 88));
		students.add(new Student("도우넛", 70, 95));
		students.add(new Student("또치", 87, 91));
		
		// 삭제.
		for(int i = 0; i < students.size(); i++) {
			if (students.get(i).getStudentName().equals("도우넛")) {
				// students[i]
				students.remove(i);
				break;
			}
		}
		
		// 출력. 이름만 출력하기.
		for(int i = 0; i < students.size(); i++) {
			System.out.println("이름: " +students.get(i).getStudentName());
		}
	}
	
	void method() {
		String[] strAry = new String[10]; // 배열.
		List<String> strList = new ArrayList<String>(); // 컬렉션.
		List<Friend> friends = new ArrayList<Friend>();
		
		friends.add(new Friend("홍길동", "010-111"));
		friends.add(new ComFriend("김길동", "010-2222", "국민은행", "신용보증팀"));
		
		friends.remove(new Friend("홍길동", "010-111"));
		System.out.println("friends크기: " + friends.size());
		
		System.out.println(friends.get(1).getFriendName());
		
		// 추가.
		strList.add("안녕하세요");
		strList.add("Hello");
		strList.add("반갑습니다");
		System.out.println("strList크기: " + strList.size());
		
		// 삭제.
		strList.remove(0);
		strList.remove("Hello");
		System.out.println("strList크기: " + strList.size());
		
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
}
