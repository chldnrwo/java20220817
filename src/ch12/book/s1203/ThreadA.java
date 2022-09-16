package ch12.book.s1203;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
}
