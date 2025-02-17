package com.Yedam.Member;

import java.util.List;

public interface MemberService {
	public void addMember();
	public List<Member> listMember();
	public Member getMember();
	public void updateMember();
	public void deleteMember();
}
