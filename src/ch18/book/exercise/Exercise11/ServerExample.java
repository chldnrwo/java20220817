package ch18.book.exercise.Exercise11;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("localhost",5001));
		
		System.out.println("[서버 시작]");
		
		while(true){
			try {
				Socket socket = serverSocket.accept();
				
				InputStream is = socket.getInputStream();
				
				byte[] bytes = new byte[1000];
				int readByteCount=-1;
				
				
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String fileName = br.readLine();
				fileName = fileName.trim();
				
				System.out.println("[파일 받기 시작]" + fileName);
				String folder = "C:\\Users\\user\\Desktop\\output\\";
				String fileName2 = folder + fileName + ".dat";
				FileOutputStream fos = new FileOutputStream(fileName);
				
				byte[] buf = new byte[1000];
				int len = 0;
				int fileSize = 0;
				while ((len = is.read(buf)) != -1) {
					fileSize += len;
					fos.write(buf, 0, len);
				}
				fos.flush();
				
				System.out.println("[파일 받기 완료]");
				
				fos.close();
				is.close();
				socket.close();
			}catch(Exception e){
				break;
			}
		}
		serverSocket.close();
		System.out.println("[서버 종료]");
	}
}
