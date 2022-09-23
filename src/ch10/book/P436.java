package ch10.book;

public class P436 {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch(Exception e) { //다형성-상속으로 잡을 수 있음(NumberFormatException)
			System.out.println("실행에 문제가 있습니다");
		} finally {
			System.out.println("다시 실행하세요");
		}
	}
}