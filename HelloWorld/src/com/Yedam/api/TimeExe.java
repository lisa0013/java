package com.Yedam.api;

public class TimeExe {
	public static void main(String[] args) {
		// ?분 ?초 합은 ? 입니다. 출력.
		// 1부터 1000000000 까지 250의 배수 합을 구하는 시간.
		
		System.currentTimeMillis(); // 현재시간을 long 반환.
		long n = 2147483648L;
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Long.MAX_VALUE); // 9223372036854775807
		
		long time1 = System.nanoTime();
		
		long sum = 0;
		for(long i = 1; i <= 1000000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000000까지의 합: " + sum);
		System.out.println("계산에 " + (time2-time1) + "초가 소요되었습니다.");
	}
}
