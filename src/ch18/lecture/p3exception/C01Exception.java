package ch18.lecture.p3exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01Exception {
	public static void main(String[] args) throws IOException {
		
		String name ="C:\\Users\\user\\Desktop\\output\\output5.txt";
		OutputStream os= new FileOutputStream(name);
		
		os.write(99); // 만약 exception 발생시 close 코드까지 실행되지 못함
		os.write(88);
		
		os.close();
		//안전하지 않음
	}
}
