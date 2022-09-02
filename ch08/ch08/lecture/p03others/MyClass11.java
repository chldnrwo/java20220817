package ch08.lecture.p03others;

public class MyClass11 implements MyInterface1 {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	//필요하면 디폴트메소드도 오버라이드 가능
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		MyInterface1.super.method2();
		//클래스 상속과 다르게 인터페이스는 앞에 인터페이스 명을 써줘야한다
	}

}
