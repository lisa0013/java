package com.Yedam;

public class Variable2 {

	public static void main(String[] args) {

		for (int j = 1; j <= 9; j++) {

//		int num = j;
			for (int i = 2; i <= 6; i++) {
//			System.out.print(num + " * " + i + " = " + num * i + "\n");
//			System.out.printf("%d * %d = %d\n", num, i, num * i); // `${num} * ${i} = ${num*i}`
				System.out.printf("%d * %d = %2d ", i, j, i * j);
			}
			System.out.println();
		}
		System.out.println("\nend of prog");
	}
}