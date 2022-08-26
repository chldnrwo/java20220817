package ch06.lecture;

public class C04Field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass3 o1= new MyClass3();
		MyClass3 o2= new MyClass3();
		
		System.out.println(o1.color);
		System.out.println(o2.color);
		
		o1.color = "red";
		
		System.out.println(o1.color);
		System.out.println(o2.color);
		
		System.out.println(o1.name);
		System.out.println(o1.age);
		System.out.println(o1.hasCar);
	}

}
