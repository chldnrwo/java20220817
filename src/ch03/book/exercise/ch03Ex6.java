package ch03.book.exercise;

public class ch03Ex6 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / 2 ;
//		double area = (lengthTop + lengthBottom) * height / 2.0 ;
//		double area = (lengthTop + lengthBottom) * height / (double)2 ;
		
		System.out.println(area);
	}
}
