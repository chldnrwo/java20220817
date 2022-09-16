package ch12.lecture;

public class C06Thread {
	//공유하는 객첵의 상태 변경
	public static void main(String[] args) throws Exception {
		//두개쓰레드 만들고 동시에 실행
		int[] arr = {0};
		Task7 t7 = new Task7();
		Task8 t8 = new Task8();
		t7.setArr(arr);
		t8.setArr(arr);
		
		Thread task1 = new Thread(t7);
		Thread task2 = new Thread(t8);
		task1.start();
		task2.start();
		
		task1.join();
		task2.join();
		
		System.out.println(arr[0]);
	}
	
	
}
class Task7 implements Runnable{
	private int[] arr;
	
	
	public void setArr(int[] arr) {
		this.arr=arr;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000000;i++) {
			arr[0]++;
		}
	}
}
class Task8 implements Runnable{
	private int[] arr;
	
	public void setArr(int[] arr) {
		this.arr=arr;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000000;i++) {
			arr[0]++;
		}
	}
}
