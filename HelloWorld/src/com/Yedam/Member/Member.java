package com.Yedam.Member;

public class Member {
	// 필드생성.
	private String memberId;
	private String name;
	private int age;
	private String phone;
	private String email;
	private String password;
	
	// 생성자.
	Member() {}
	
	Member(String memberId, String name, int age, String phone, String email, String password) {
		this.memberId = memberId;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.password = password;
		
		
	}
	// getter, setter.
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
