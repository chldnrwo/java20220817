package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C03WildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("maverick");
		list1.add("iceman");
		
		ArrayList<?> list2 = list1;
		//list2.add("");
		
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(100);
		list3.add(200);
		
		ArrayList<?> list4 = list3;  //뭐가올지 모르기에 스트링 인티저 다 안됨
		//list4.add(300);  
		//list4.add(new Object());
		Object o1 = list4.get(0);
	}

}
