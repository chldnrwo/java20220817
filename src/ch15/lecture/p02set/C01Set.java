package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C01Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("ironman");
		set.add("captain");
		set.add("black");
		set.add("hulk");
		
		int size = set.size();
		System.out.println(size);
		
		set.add("hulk");
		
		System.out.println(set.size());
		
		// 이미 있는 지 확인
		System.out.println(set.contains("captain"));
		System.out.println(set.contains("batman"));
		
		System.out.println(set.remove("captain"));
		System.out.println(set.remove("superman"));
		System.out.println(set.size());
		
	}
}	
