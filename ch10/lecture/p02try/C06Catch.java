package lecture.p02try;

public class C06Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=3/0;
			
		}
		catch(Throwable e) { //Object부턴 안된다
			System.out.println("영으로 나누려고??");
		}
	}

}
