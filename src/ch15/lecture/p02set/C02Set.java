package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("spring");
		set.add("jsp");
		set.add("css");
		set.add("html");
		set.add("java");
		
		System.out.println("향상된 for문");
		for(String element : set){
			System.out.println(element);
		}
		System.out.println("Iterator 사용");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("foreach메소드 사용");
		set.forEach((e)->System.out.println(e));
	}
}
