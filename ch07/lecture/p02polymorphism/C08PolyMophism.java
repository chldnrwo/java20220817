package lecture.p02polymorphism;

public class C08PolyMophism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "maverick";
		System.out.println(a.length());
		
		Object b="coyote";
		//System.out.println(b.length()); //object는 length메소드가 없음
	
		String c = (String)b;
		System.out.println(c.length());
	
	}

}
