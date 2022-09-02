package ch08.lecture.p03others;

public interface MyInterface1 {
	void method();
	
	//public 생략되있음
	default void method2() {
		//재정의 하지 않아도 되는 인스턴스 메소드
		//interface default method
	}
}
