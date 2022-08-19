package ch02.lecture;

public class C08TypeConversion {

	public static void main(String[] args) {
		//타입변환
		//작은 타입에서 큰 타입으로는 자동변환
		//큰 타입에서 작은 타입으로는 강제 변환(cast 연산, casting)
		
		//자동형변환 
		int a =33;  //4바이트
		short b=55; //2바이트
		
		a=b; //자동 형변환
		//b=a; 이건 안됨 
		
		char c = '가';
		a=c;
		
		long d = c;
		//short e = c; 안됨
		
		float f = 3.14F;
		double g =f;
		int h =999;
		float i =h;
		double j = h;
		long k = 99999L;
		float L = k;
		double m = k;
		
		boolean n = true;
		//int o= n; //x
		
		//강제 형변환(큰타입 -> 작은타입)
		long q = 9999999L;
		//int p = q;
		int p =(int)q;
		int r = (int)q;
		System.out.println(r);
		
		q = 30_0000_0000L;
		r=(int)q;
		System.out.println(r);
		
		//실수 -> 정수는 강제형변환
		float s=3.14F;
		int t= (int)s;
		int u=(int)s;
		System.out.println(u);
		
		double v = 3.14;
		u=(int)v;
		System.out.println(u);
		
		
		
	}

}
