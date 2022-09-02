package lecture.p02lambda;

public class MyClass1 {
	public static void main(String[] args) {
		MyInterface o1 = () -> {
			System.out.println("코드 작성");
		};
		
		o1.method1();
	}
}


//재정의 해야할 메소드 한 개 (추상메소드 1개)
interface MyInterface{
	void method1();
}