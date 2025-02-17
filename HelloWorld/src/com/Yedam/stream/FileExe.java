package com.Yedam.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileExe {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("c:/temp/test1.dat");
			while (true) {
				int data = is.read(); // 바이트 읽고 반환. -1값 반환.
				System.out.println(data);
				if (data == -1)
					break;
			}
			is.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("end of prog.");
	}

	void output() {
		// 출력스트림(바이트기반) OutputStream.
		try {
			OutputStream os = new FileOutputStream("c:/temp/test1.dat");
			os.write(10);
			os.write(20);
			os.write(30); // 쓰기.
			os.flush(); // 버퍼비우기.
			os.close(); // 리소스 반환.

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
