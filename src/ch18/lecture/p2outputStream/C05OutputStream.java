package ch18.lecture.p2outputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C05OutputStream {
	public static void main(String[] args) throws IOException {
		String src = "C:\\Users\\user\\Desktop\\output\\squidgame.jpg";
		String des = "C:\\Users\\user\\Desktop\\output\\squidgame22.jpg";
		
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(des);
		
		byte[] buffer = new byte[100];
		int len=0;
		while((len=fis.read(buffer))!=-1) {
			fos.write(buffer,0,len);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
