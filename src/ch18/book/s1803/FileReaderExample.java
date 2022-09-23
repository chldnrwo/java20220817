package ch18.book.s1803;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		String fileName =  "src/ch18/book/s1803/FileReaderExample.java";
		FileReader fr = new FileReader(fileName);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=fr.read(cbuf))!=-1) {
			String data = new String(cbuf,0,readCharNo);
			System.out.println(data);
		}
		fr.close();
	}
}
