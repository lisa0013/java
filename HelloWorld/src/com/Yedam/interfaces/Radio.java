package com.Yedam.interfaces;

public class Radio implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("라디오의 전원을 켭니다.");	
	}
	@Override
	public void trunOff() {
		System.out.println("라디오의 전원을 끕니다.");			
	}
}
