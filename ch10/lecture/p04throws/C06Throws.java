package lecture.p04throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C06Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void method1() throws IOException {
		FileReader a = new FileReader("a");
		
	}

}
