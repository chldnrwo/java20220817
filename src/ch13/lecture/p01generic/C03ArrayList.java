package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C03ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr1 = new ArrayList();
		arr1.add(3);
		
		Object o1 = arr1.get(0);
		if(o1 instanceof Integer) {
		int v1 = (Integer)arr1.get(0); // 값꺼내기
		System.out.println(v1);
		}
	}

}
