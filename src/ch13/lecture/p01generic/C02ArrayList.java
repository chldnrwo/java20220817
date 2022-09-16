package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C02ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr1 = new ArrayList();
		arr1.add(3);
		arr1.add(6);
		arr1.add(9);
		
		System.out.println(arr1);
		
		arr1.add(12);
		System.out.println(arr1);
		
		arr1.remove(arr1.size() -1);
		System.out.println(arr1);
	}

}
