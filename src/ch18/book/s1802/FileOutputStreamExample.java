package ch18.book.s1802;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String[] args) throws IOException {
		String originalFileName = "C:\\Users\\user\\Desktop\\output\\squidgame.jpg";
		String targetFileName = "C:\\Users\\user\\Desktop\\output\\squidgame2.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteNo);
		}
				
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
