package lecture.p02try;

public class C03Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 3 / 3 ;
			
			if(a==1) {
				return; //리턴 키워드는 메소드를 종료시킴
			}
		}
		catch(ArithmeticException e) {
			System.out.println("exception!!! ");
		}
		finally{
			System.out.println("@@@@finally"); // 하지만 finally는 무조건 실행됨
		}
	System.out.println("continue......");
	}

}
