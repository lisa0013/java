package com.Yedam.api;

public class StringExam {

	public static void main(String[] args) {

		no1();
		no2();
		no3();
	}

	static void no1() {

		String ex1 = "0505053555555";
		String ex2 = "050505 4555555";
		String ex3 = "050505-9555555";

		StringUtil.checkGender(ex1);
		StringUtil.checkGender(ex2);
		StringUtil.checkGender(ex3);
	}

	static void no2() {

		String ex1 = "C:/temp/flower.jpg";
		String ex2 = "D:/web/project/guide.mp3";

		StringUtil.checkExtension(ex1);
		StringUtil.checkExtension(ex2);
	}

	static void no3() {

		String ex1 = "  suggest ";
		String ex2 = "  currently  ";
		String ex3 = "  particular  ";

		StringUtil.getLength(ex1);
		StringUtil.getLength(ex2);
		StringUtil.getLength(ex3);
	}
}
