package ch04.book;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=9;i++) {
			System.out.println("****"+i+"단 갑니다****");
			for(int j=2;j<=9;j++) {
				System.out.println(i + "x" + j +"="+(i*j));
			}
		}
	}	

}