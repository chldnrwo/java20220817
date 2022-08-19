package ch02.lecture;

public class C11String {

	public static void main(String[] args) {
		//string 문자열
		//참조타입(객체)
		//char 문자
		
		char a = 'd';
		String b = "asdada";
		String c = "";
		
		// +(연결연산)의 결과는 String
		String d="hello";
		char e='!';
		String f = d+e;
		System.out.println(f);
		
		String g = d+100; //문자열로 인식되서 이어씀
		System.out.println(g);
		
		String i = d+true;
		System.out.println(i);
		
		String h = d+3.14;
		System.out.println(h);
		
		String j = d+ "world";
		System.out.println(j);
		
		String k ="bts";
		char l = k.charAt(0);
		int m = k.charAt(0);
		System.out.println(l);
		System.out.println(m);
		
		char n=k.charAt(0);
		char o=k.charAt(1);
		char p=k.charAt(2);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		
		// k.charAt(-1); out of bound
		// k.charAt(3); out of bound
		
		// length : 길이 리턴
		int q=k.length();
		System.out.println(q);
		
		String r="javascript";
		System.out.println(r.length());
		
		System.out.println("hello world".length());
		System.out.println("".length());
		System.out.println(r.charAt(r.length()-1));
		
		//Substring 시작은 포함되지만, 끝은 포함이 안되기에 ++해야됨
		
//		String s = r.substring(0);
//		System.out.println(s);
//		String t = r.substring(1);
//		System.out.println(t);
//		
		for(int I=0;I<r.length();I++) {
			System.out.println(r.substring(I));
		}
		for(int I=0;I<r.length();I++) {
			for(int J=I;J<r.length()+1;J++) {
				System.out.println(r.substring(I,J));
				
			}
		}
		
		System.out.println("\n"+r.substring(0,4));
		System.out.println(r.substring(2,4));
	}

}
