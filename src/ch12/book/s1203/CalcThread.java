package ch12.book.s1203;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<2000000000;i++) {
			
		}
		System.out.println(getName());
	}
}
