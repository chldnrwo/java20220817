package ch13.book.s1305;

import ch13.book.s1302.Box;

public class Util {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
