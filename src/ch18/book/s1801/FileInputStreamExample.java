package ch18.book.s1801;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/book/s1801/FileInputStreamExample.java";
		FileInputStream fis = new FileInputStream(path);
		
		int data;
		while( ( data=fis.read() )!= -1 ) {
			System.out.write(data);
		}
		fis.close();
	}
}
