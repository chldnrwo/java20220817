package lecture.p01Inheritance;

public class SubClass4 extends SuperClass4{
	
	//상위클래스 메소드 재정의(override) 가능\
	@Override //컴파일러에게 재정의(Override) 메소드인지 점검받는 annotation
	public void method1() {
		System.out.println("subClass4 메소드1");
	}
	
	public void method2() {
		System.out.println("subClass4 메소드2");
	}
	
	@Override
	public void method3() {
		System.out.println("subClass4 메소드3 재정의");
	}
}
