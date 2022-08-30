package lecture.p01Inheritance;

public class C02Extends {
	public static void main(String[] args) {
		SubClass3 o1 = new SubClass3();
		SuperClass3 o2 = new SuperClass3();
		
		o1.method1();
		o1.method2();
		o1.method3();
		
		o2.method1();
		o2.method2();
		//o2.method3();
		
		//한번에 하나의 클래스만 상속가능
	}
}
