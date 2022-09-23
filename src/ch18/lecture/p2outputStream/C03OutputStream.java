package ch18.lecture.p2outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C03OutputStream {
	public static void main(String[] args) throws IOException {
		//String inputFile = "src/ch18/lecture/p2outputStream/C03OutputStream.java";
		String name = "C:\\Users\\user\\Desktop\\output\\output3.txt";
		
		OutputStream os = new FileOutputStream(name);
		
		//write(byte[] b, int off, int len)
		//param1 : 쓸 데이터
		//param2 : 배열의 시작 위치
		//param3 : 시작 위치부터의 길이
		byte[] b = new byte[100];
		os.write(b, 1, 3); //b배열의 1번인덱스~3번인덱스(3bytes)
		os.write(b,0,15); // b배열의 0번인덱스~14번인덱스(15bytes)
		os.write(b,50,30); // b배열의 50번인덱스~79번인덱스(30bytes)
		
		os.close();
	}
}