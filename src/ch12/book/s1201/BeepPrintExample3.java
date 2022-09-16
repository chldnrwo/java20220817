package ch12.book.s1201;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				}
			}
		});
		
		Thread thread2 = new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("띵");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				}
			}
		});
		
		thread.start();
		thread2.start();
	}
}
