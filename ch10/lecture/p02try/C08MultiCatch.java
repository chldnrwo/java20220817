package lecture.p02try;

public class C08MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"삼백"};
		
		try {
			int a = Integer.parseInt(arr[0]);
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
			System.out.println("exception 발생!!!");
		}
		
		
	}

}
