package ch05.exercise;

public class Exercise010203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 4번
		//2. 3번 우리가 메모리를 직접건드릴수 없다 가비지콜렉터가 할 일 
		//3. 2번
		String s = 3+3+"3";
		System.out.println(s);
		
		System.out.println(half(5));
	}	
	public static double half(int n) {
		return n/2;
	}
	public static double half(double n) {
		return n/2;
	}

}
