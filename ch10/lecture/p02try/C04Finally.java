package lecture.p02try;

public class C04Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("코드");
		}
		finally {
			System.out.println("항상실행하는코드");
			System.out.println("catch 블록 없이 사용 가능");
			System.out.println("catch 블럭 있으면 그다음(마지막)에 작성");
		}
	}

}
