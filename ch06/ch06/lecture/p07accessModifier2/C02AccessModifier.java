package ch06.lecture.p07accessModifier2;

import ch06.lecture.p07accessModifier.MyClass1;

public class C02AccessModifier {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		o1.name = "iceman"; //접근 지정자 생략해서 다른 패키지에선 사용불가
		//o1.printName(); //접근 지정자 없어서 다른 패키지에서 사용불가
		
		o1.age = 99999; //public 멤버는 다른 패키지에서 사용가능
		o1.printAge(); //public 멤버는 다른 패키지에서 사용가능
	}
}
