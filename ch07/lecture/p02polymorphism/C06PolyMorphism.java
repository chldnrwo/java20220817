package lecture.p02polymorphism;

public class C06PolyMorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass3 o1 = new SubClass3();
		
		SuperClass3 o2 = o1;
		
		System.out.println(o2 == o1); //참조값이 같다
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
		
		o1.method1();
		o2.method1(); //실제의 인스턴스의 메소드가 실행됨
		
		SuperClass3 o3 = new SuperClass3();
		o3.method1();
	}

}
