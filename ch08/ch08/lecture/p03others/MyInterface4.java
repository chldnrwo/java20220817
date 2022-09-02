package ch08.lecture.p03others;

public interface MyInterface4 {
	
	//항상 public
	static void method4() {
		System.out.println("인스턴스 생성없이 실행가능");
	}
	
	
	void method1();
	
	default void method2() {}
	
	private void method3() {}
	
	
}
