package ch06.lecture.p08Singleton;

public class C01Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyClass1 o1 = new MyClass1();
		//MyClass1 o2 = new MyClass1();
		
		//System.out.println(System.identityHashCode(o1));
		//System.out.println(System.identityHashCode(o2));
		
		MyClass1 o1 = MyClass1.getInstance();
		MyClass1 o2 = MyClass1.getInstance();
		
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
	}

}
