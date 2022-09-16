package ch15.book.s1504;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: "+size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: "+set.size());
		
		iterator =set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		System.out.println();
		
		System.out.println("향상된 for문");
		for(String element : set){
			System.out.println(element);
		}
		System.out.println();
		
		System.out.println("foreach메소드 사용");
		set.forEach((e)->System.out.println(e));
		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
