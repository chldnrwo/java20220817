package ch12.book.s1204;

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		calculator.setMemory(100);
	}
}
