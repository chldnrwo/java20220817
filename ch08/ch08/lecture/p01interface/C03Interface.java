package ch08.lecture.p01interface;

public class C03Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface3 o1 = new MyClass3();
		MyInterface3 o2 = new MyClass4();
		
		o1.method1();
		o1.method2();
		o1.method3();
		o1.method4();
		
		o2.method1();
		o2.method2();
		o2.method3();
		o2.method4();
		
		method1(o1);
		method1(o2);
		System.out.println("========메소드 호출");
	}

	public static void method1(MyInterface3 o) {
		o.method1();
		o.method2();
		o.method3();
		o.method4();
	}
}
