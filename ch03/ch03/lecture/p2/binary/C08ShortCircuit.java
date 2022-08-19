package ch03.lecture.p2.binary;

public class C08ShortCircuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//short circuit
		// &&,|| 발생
		int i=3;
		//& | 발생
		//&&연산에서 앞에 가 FAlse면 무조건 false라 이후 연산을 안함
		if(i<0&&i>-5) {
			System.out.println("i는 -5보다 크고 0보다 작다");
		}
		System.out.println("프로그램 종료");
		
		//지금 뒤쪽의 연산이 안 되었음 되었다면 i=5였어야 한다
		if((i++)<0&&(i++)>-5) {
			System.out.println("i는 -5보다 크고 0보다 작다");
		}
		System.out.println("i : "+i);
	}

}
