package com.Yedam.api;

public class StringExe {
	public static void main(String[] args) {
		// String str = new String(매개값);
		String str = new String(new byte[] {72, 101, 108, 108, 111});
		System.out.println(str);
		
		byte[] result = str.getBytes(); // 문자열 => byte[] 반환.
		for(byte b : result) {
			System.out.println(b);
		}
	}
}
