package ch08.lecture.p02anonymous;

public class C01Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyInterface1 o1 = new MyInterface1();
//		MyInterface1 o2 = new MyClass1();
		
		MyInterface1 o3 = new MyInterface1() {
			@Override
			public void method() {
				System.out.println("재정의한 메소드!");
			}
		};
		
		o3.method();
	}
	
}

//class MyClass1 implements MyInterface1() {
//	@Override
//	public void method() {
//		
//	}
//}

interface MyInterface1{
	void method();
}

