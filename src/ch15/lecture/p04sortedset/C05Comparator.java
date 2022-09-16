package ch15.lecture.p04sortedset;

import java.util.TreeSet;

public class C05Comparator {
	public static void main(String[] args) {
		TreeSet<Book> books = new TreeSet<Book>();
		books.add(new Book("java",100));
		books.add(new Book("css",50));
		books.add(new Book("jsp",300));
		
		System.out.println(books);
		
		
	}
}
