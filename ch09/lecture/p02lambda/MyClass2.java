package lecture.p02lambda;

public class MyClass2 {
	public static void main(String[] args) {
		MyInterface2 o1 = () -> System.out.println("코드 작성!!");
	
			o1.method();
	}
}

interface MyInterface2{
	void method();
}