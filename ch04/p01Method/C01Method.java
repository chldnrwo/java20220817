package p01Method;

public class C01Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		//call method(invoke method)
		method1();
		method2();
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
	}

	public static void method1() {
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
	}
	
	public static void method2() {
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
	}
}
