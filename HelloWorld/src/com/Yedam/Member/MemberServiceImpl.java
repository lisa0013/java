package com.Yedam.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberServiceImpl implements MemberService {
	
	List<Member> members;
	
	// 생성자 추가
	public MemberServiceImpl () {
		members = new ArrayList<Member>();
		
		members.add(new Member("user01", "이민영", 25, "010-1234-5678", "user01@example.com", "pass1234"));
		members.add(new Member("user02", "김영진", 30, "010-2345-6789", "user02@example.com", "qwerty12"));
		members.add(new Member("user03", "박지영", 28, "010-3456-7890", "user03@example.com", "abcdef56"));
		members.add(new Member("user04", "정문석", 35, "010-4567-8901", "user04@example.com", "zxcvbn78"));
		members.add(new Member("user05", "이지원", 27, "010-5678-9012", "user05@example.com", "1234abcd"));
	}
	

	@Override
	public void addMember() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member> listMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member getMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMember() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember() {
		// TODO Auto-generated method stub
		
	}

}
