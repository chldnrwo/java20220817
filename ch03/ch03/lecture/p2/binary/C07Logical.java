package ch03.lecture.p2.binary;

public class C07Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리 연산자
		// and : &&, &;
		// or : ||, |
		// xor : ^
		// not : !
		// 피연산자 : boolean
		// 결과 : boolean
		
//		// and : 
//		T && T = T
//		T && F = F
//		F && T = F
//		F && F = F
//		// or : 
//		T || T = T
//		T || F = T
//		F || T = T
//		F || F = F
//		// xor : 
//		T ^ T = F
//		T ^ F = T
//		F ^ T = T
//		F ^ F = F
		
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
	}

}
