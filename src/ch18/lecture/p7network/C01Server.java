package ch18.lecture.p7network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {
	public static void main(String[] args) {
		//서버 : 연결을 기다림
		//연결 요청을 수락함
		//Socket 만들기 위해
		//ServerSocket 사용
		
		try (
				//ServerSocket 만듦
				ServerSocket serverSocket = new ServerSocket(50000);
				Socket socket = serverSocket.accept();
				) {
			
			System.out.println(socket.getRemoteSocketAddress());
			
			//연결 기다림
			System.out.println("연결 기다림");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
