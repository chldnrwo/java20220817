package ch06.lecture.p03method;

public class C03Parameter {
		public static void main(String[] args) {
			
			MyClass3 o1 = new MyClass3();
			
			o1.method1();
			o1.method2(3); //argument
			o1.method3("hello");
			o1.method4(9, 8);
			o1.method5("hello", "java");
			o1.method6(3,"java");
			
			o1.method6();
			o1.method6(3);
			o1.method6("java");
			o1.method6(3, "java");
			o1.method6("java", 3);
			
			o1.method7(99,"mav");
			o1.method7(88, "rooster");
			
			
			
			
			
			
			
}
		
}
