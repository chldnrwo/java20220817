package ch06.lecture.p09GetSet;

public class C01Encapulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 o1 = new MyClass1();
//		o1.age;
//		System.out.println(o1.age);
		
		o1.setAge(30);
		System.out.println(o1.getAge());
		o1.setAge(-30);  //0보다 작아서 set이 안됨
		System.out.println(o1.getAge());
	}

}
