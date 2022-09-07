package lecture.p02try;

public class C07Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//catch 블럭은 순서가 상관있음
		//
		String[] arr = {"삼백"};
		
		try {
			int a= Integer.parseInt(arr[0]);
			
			System.out.println(a);
		}
		// 여러 catch 블럭 자성시 상위타입을 catch하는 블럭을 먼저 쓸 수 없음
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("wrong index !!!");
		}
		catch(Exception e) {
			System.out.println("wrong format@@@@@");
		}
	}

}
