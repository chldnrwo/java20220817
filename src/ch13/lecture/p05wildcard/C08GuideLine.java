package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C08GuideLine {
	public static void main(String[] args) {
		//PECS
		//Produce => extends
		//Consume => Super
		
		//get => extends
		//put => Super
		
		//int => extends
		//out => super
		
		
	}
	
	public static void method1(ArrayList<? extends Number> list) {
		Number n1 = list.get(0);
		//list.add(3);
	}
	public static void method2(ArrayList<? super Number> list) {
		//Number n1 = list.get(0);
		list.add(3);
	}
}
