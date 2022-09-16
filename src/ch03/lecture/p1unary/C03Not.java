package ch03.lecture.p1unary;

public class C03Not {
	public static void main(String[] args) {
		//논리부정연산자 (not)
		// ! 
		//피연산자는 boolean
		//연산결과는 boolean, 피연산자를 반대값으로 (true -> false, false -> true)
		
		boolean a = true;
		boolean b = false;
		
		boolean c = !a;
		boolean d = !b;
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(!c); //true 증감연산자처럼 값이 바뀌지는 않음
		System.out.println(!d); //false
	}
}
