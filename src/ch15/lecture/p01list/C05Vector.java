package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class C05Vector {
	public static void main(String[] args) {
		List<String> list = new Vector<>();
		list.add("java");
		list.add("css");
		System.out.println(list);
		list.add("java");
		list.add(null);
		list.add(null);
		list.add("java");
		
		System.out.println(list);
	}
}
