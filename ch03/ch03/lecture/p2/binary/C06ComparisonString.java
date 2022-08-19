package ch03.lecture.p2.binary;

public class C06ComparisonString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello";
		String b ="hi";
		
//		System.out.println(a<b);
		//string끼리 같은지 비교연산 (==,!=)
		boolean C = a.equals(b);
		System.out.println(C);
		
		String c = "java";
		String d = "java";
		String e = "ja";
		String f = "va";
		String g = e+f;
		
		System.out.println(c==d);
		System.out.println(c.equals(g));
	}

}
