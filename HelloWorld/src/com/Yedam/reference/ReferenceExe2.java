package com.Yedam.reference;

public class ReferenceExe2 {

	public static void main(String[] args) {
	
		// 배열[][] => 다차원배열.
		String[][] scores = new String[5][2]; // 5 * 2 배열선언.
//        String[][] scores = {{"홍길동", "80"},
//		                       {"김민수", "85"},
//		};		
		
		scores[0][0] = "홍길동";
		scores[0][1] = "80";
		
//		scores[1] = new String[] {"김민수", "85"};
		scores[1][0] = "김민수";
		scores[1][1] = "85";
		
		scores[2][0] = "박헌수";
		scores[2][1] = "88";
		
		scores[3][0] = "심상현";
		scores[3][1] = "90";
		
		scores[4][0] = "최기동";
		scores[4][1] = "75";
		// 각 위치에 값 지정.
		int sum = 0;
		String[] temp = {"", ""};
		for(int i = 0; i < scores.length; i++) {
			System.out.println("점수=> " + scores[i][1]);
			sum += Integer.parseInt(scores[i][1]); // sum 값을 누적.
	   //최고 점수 이름 출력?
		}
		System.out.printf("sum의 값은 %d\n", sum);
		
	}
}
