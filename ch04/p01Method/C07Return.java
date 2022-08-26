package p01Method;

public class C07Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		
		method1();
		
		System.out.println(2);
	}
	public static double method5() {
		
		return 5;
	}
	public static double method4() {
		
		return 3.14;
	}
	public static String method3() {
		
		return "hello";
	}
	
	public static int method2() {
		//메소드 종료
		//	오른쪽 값을 호출한 곳으로 반환
		
		// 리턴으로 반환할때 리턴타입과 반환값의 타입이 일치해야함
		return 3;
	}
	
	
	public static void method1() {
		System.out.println("가");
		
		if(true){
			return;
		}
		
		
		System.out.println("나");
	}
}
