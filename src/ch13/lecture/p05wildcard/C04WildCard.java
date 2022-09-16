package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C04WildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(300);
		
		//? super Type : LowerBound WildCard
		ArrayList<? super Integer> list2 = list1;
		list2.add(500);
		//
	}

}
