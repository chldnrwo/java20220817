package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C06Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(); //기본타입 못넣음
		
		list.add(3);
		list.add(6);
		
		int v1 = list.get(0);
		Integer v2 = list.get(1);
		
		System.out.println(v1);
		System.out.println(v2);
	}

}
