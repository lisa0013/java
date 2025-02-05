package com.Yedam.interfaces;

import com.Yedam.ingeritance.ComFriend;
import com.Yedam.ingeritance.Friend;

public class RemoteControlExe {
	public static void main(String[] args) {
		// 상속관계 => 부모클래스 참조변수 = 자식인스턴스.
		// 인터페이스 => 인터페이스 참조변수 = 구현객체의 인스턴스.
		
		Friend friend = new ComFriend("", "", "", "");
		RemoteControl rc = new Television();
		System.out.println(RemoteControl.MAX_VOLUME);
		rc = new Radio();
		
		rc = new Radio();
		rc.turnOn();
	}
}
