package p01Method;

public class C03Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2(5);
		System.out.println(3);
	}
	public static void method1() {
		System.out.println("메소드1 실행");
	}
	public static void method2(int i) {
		//메소드 파라미터-인자 매개변수
		//(안에) 타입과 파라미터명 나열
		System.out.println("메소드2 실행");
		System.out.println("i : "+i);
	}
}
