package lecture.p04throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C04Throws {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		method1();
	}
	public static void method1() throws FileNotFoundException {
		//이코드를 try/catch 사용하지않고 컴파일 되도록 수정
		InputStream is = new FileInputStream("");
	}
}
