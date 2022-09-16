package ch13.book.s1305;

import ch13.book.s1302.Box;

public class BoxingExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int  intValue = box1.get();
		
		Box<String> box2 = Util.<String>boxing("홍길동");
		String strValue = box2.get();
		
	}
}
