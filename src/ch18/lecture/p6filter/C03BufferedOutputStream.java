package ch18.lecture.p6filter;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03BufferedOutputStream {
	public static void main(String[] args) throws Exception {
		
		long start = System.currentTimeMillis();
		normalStream();
		long end = System.currentTimeMillis();
		
		System.out.println("그냥 스트림 사용 종료:" + (end - start)+"ms");
		
		start = System.currentTimeMillis();
		bufferedStream();
		end = System.currentTimeMillis();
		
		System.out.println("버퍼드 스트림 사용 종료:" + (end - start)+"ms");
	}
	
	private static void bufferedStream() throws Exception {
		String path ="C:\\Users\\user\\Desktop\\output\\output11.txt";
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		for(int i=0;i<1024*1024*10;i++) {
			bos.write(97);
		}
		
		
		bos.close();
	}
	

	private static void normalStream() throws Exception {
		String path= "C:\\Users\\user\\Desktop\\output\\output10.txt";
		FileOutputStream fos = new FileOutputStream(path);
		
		for(int i=0;i<1024*1024*10;i++) {
			fos.write(97);
		}
		
		
		
		fos.close();
	}
}
//버퍼가 존나빠름