package ch06.lecture.p04static;

public class MyClass3 {
	String name;
	static String company = "topgun";
	
	public MyClass3(String name) {
		this.name = name;
	}
	//static method
	static void printCompany() {
		//System.out.println(this.company); 스태틱멤버는 인스턴스 멤버에 접근 불가
		System.out.println(company);
	}
	//instance method
	void printName() {
		System.out.println(this.name);
	}
	
	void showCompany() {
		//인스턴스 멤버는 스태틱멤버에 접근가능
		System.out.println(company);
	}
	
	void someInstanceMethod() {
		//this는 instance멤버 접근시 사용가능
		System.out.println(this.name);
		this.printName();
		printName();
	}
}
