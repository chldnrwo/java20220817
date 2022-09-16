package ch15.lecture.p04sortedset;

import java.util.TreeSet;

public class C07Comparable {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("java");
		set.add("css");
		set.add("html");
		set.add("CSS");
		
		System.out.println(set);
	}
}
