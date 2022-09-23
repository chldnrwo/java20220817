package ch18.lecture.p3exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C03Exception {
	public static void main(String[] args) {
		//try with resources (java8부터 가능)
		//try with resources 와 사용가능한 type은 autoClosable만 가능
		try(
			//여기서 선언된 작업은 자동으로 닫아줌
			OutputStream os = new FileOutputStream("");
			InputStream is = new FileInputStream("");	
				){
			//읽고쓰는 작업
			os.write(3);
			is.read();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
