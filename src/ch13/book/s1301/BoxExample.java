package ch13.book.s1301;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.set("홍길동");
		String name = (String)box.get();
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
	}

}
