package lecture.p01nestedClass;

public class MyClass4 {
	public static void main(String[] args) {
		//lambda expression
		//클래스 구현 메소드 시그니쳐 생략가능
		//추상메소드가 하나인 경우만
		MyInterface4 l = () -> {
			System.out.println("재정의한 메소드");
		};
	}
}
interface MyInterface4{
	void method();
	//void method2(); 재정의할 메소드 하나여야만한다 0개x 2개x
}