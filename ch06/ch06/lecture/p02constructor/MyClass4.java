package ch06.lecture.p02constructor;

public class MyClass4 {
	//fields
	String name;
	int age;
	
	//constructors
	public MyClass4(String name, int age) {
		//this : 앞으로 만들어질 객체의 참조값
		this.name = name;
		this.age = age;
		//제일 가까운 변수를 보아서 초기화가 안됨
	}
}
