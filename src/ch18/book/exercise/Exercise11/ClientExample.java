package ch18.book.exercise.Exercise11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("localhost",5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:\\Users\\user\\Desktop\\output\\squidgame.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		byte[] buf = new byte[100];
		fis.read(buf);
		bos.write(buf, 0, 100);
		
		
		System.out.println("[파일 보내기 시작] " + fileName);
		buf = new byte[1000];
		int len = 0;
		while ((len = bis.read(buf)) != -1) {
			bos.write(buf, 0, len);
		}
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
