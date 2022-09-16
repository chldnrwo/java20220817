package ch15.book.s1502;

import java.util.*;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동","신용권","감자바");
		
		System.out.println("일반 for");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("향상된 for");
		for(String item: list1) {
			System.out.println(item);
		}
		
		System.out.println("forEach 메소드");
		list1.forEach((e)->System.out.println(e));
		
		System.out.println("iterator 메소드");
		Iterator<String> iterator = list1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		
		System.out.println("일반 for");
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
		
		System.out.println("향상된 for");
		for(int item: list2) {
			System.out.println(item);
		}
		
		System.out.println("forEach 메소드");
		list2.forEach((e)->System.out.println(e));
		
		System.out.println("iterator 메소드");
		Iterator<Integer> iterator2 = list2.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
