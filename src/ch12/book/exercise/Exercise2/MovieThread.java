package ch12.book.exercise.Exercise2;

public class MovieThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			System.out.println("동영상을 재생합니다.");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			
			}
		}
	}
}
