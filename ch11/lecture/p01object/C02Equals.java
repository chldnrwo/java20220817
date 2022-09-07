package lecture.p01object;

public class C02Equals {

	public static void main(String[] args) {
		System.out.println("Object equals()");
		Object o1 = new Object();
		Object o2 = new Object();

		System.out.println(o1.equals(o2));
		System.out.println(o2.equals(o1));
		System.out.println(o1.equals(o1));
		System.out.println(o2.equals(o2));
		
		System.out.println("String equals()");
		
		Object o3 = new String("top gun");
		Object o4 = new String("top gun");
		
		System.out.println(o3.equals(o4)); //참조변수와 상관없이 실제 인스턴스로 비교해서
		System.out.println(o4.equals(o3)); //String 클래스는 오버라이드 되어있음
		System.out.println(o3.equals(o3));
		System.out.println(o4.equals(o4));
		
		System.out.println("String ==");
		System.out.println(o3 == o4);
	}

}
