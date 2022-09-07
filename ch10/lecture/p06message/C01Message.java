package lecture.p06message;

public class C01Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인코드 1");
		method1();
		System.out.println("메인 실행 이어감~");
	}
	
	private static void method1() {
		System.out.println("메소드1 코드");
		try {
			method2();
		} catch (Exception e) {
			//로그 꼭 남기기
			e.printStackTrace();
			}
		System.out.println("메소드1 실행 이어감~");
	}
	private static void method2() throws Exception {
		throw new Exception();
	}

}
