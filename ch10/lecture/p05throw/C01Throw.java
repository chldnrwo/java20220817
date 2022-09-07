package lecture.p05throw;

import java.io.FileReader;

public class C01Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println("실행 예외 잡았다.");
		}
		
		System.out.println("프로그램 실행 이어감");
	}

	private static void method1() {
		System.out.println("코드1");
		System.out.println("코드2");
		
		//예외 발생
		//throw exception
		throw new RuntimeException();
		
	}

}
