package ch08.book.Exercise5;

public class ActionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action action =	new Action() {

			@Override
			public void work() {
				System.out.println("복사를 합니다");
				
			}
			
		};
				
		action.work();
	}

}
