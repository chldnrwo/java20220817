package P03String;

public class P03String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=3;
		
		System.out.println(a==b);
		String s1="java";
		String s2="java";
		System.out.println(s1==s2); //true s1이 가리키는 객체와 s2가 가리키는 객체는 같다

		String s3="ja";
		String s4="va";
		String s5=s3+s4;
		System.out.println(s5);
		System.out.println(s1);
		
		System.out.println(s1==s5);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s5)); //s1의 참조값과 s5의 참조값은 다르다
		
		System.out.println(s1.equals(s5));
		System.out.println(s1.contentEquals(s5));
		}

}
