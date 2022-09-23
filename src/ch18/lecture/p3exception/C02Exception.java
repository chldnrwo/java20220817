package ch18.lecture.p3exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C02Exception {
	public static void main(String[] args) {
		
		OutputStream os=null;
		InputStream is = null;
		try {
			String name ="C:\\Users\\user\\Desktop\\output\\output5.txt";
			os = new FileOutputStream(name);
			is = new FileInputStream("");
			
			os.write(99); // 만약 exception 발생시 close 코드까지 실행되지 못함
			os.write(88);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(is!=null) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
