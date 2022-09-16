package ch12.lecture;

import java.awt.Toolkit;

public class C01Thread {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			
			Thread.sleep(1000);
		}
		
		//소리 출력
		Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			
			Thread.sleep(1000);
		}
	}
}
