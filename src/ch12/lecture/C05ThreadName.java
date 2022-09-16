package ch12.lecture;

public class C05ThreadName {
	public static void main(String[] args) {
		Thread t1 = new Task5();
		t1.setName("문자 출력 쓰레드");
		t1.setPriority(10);
		t1.start();
		
		Thread t2 = new Task5();
		t2.setName("소리 출력 쓰레드");
		t2.setPriority(1);
		t2.start();
	}
}

class Task5 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100000;i++) {
			System.out.println(getName()+":"+i);
		}
	}
}