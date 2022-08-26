package p01Control;

import java.util.Scanner;

public class C15Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "hello my javascript";
		Scanner sc = new Scanner(src);
		
		String a = sc.next();
		String b = sc.nextLine();
		
		System.out.println(a);
		System.out.println(b);
		
		//next는 공백이 나왔을때 종료
		//nextLine은 엔터까지 눌러야 종료
		//이 경우 a가 첫번째 토큰까지 출력 b가 첫번째 토큰 제외한 나머지를 출력 
		
		
		String src2 = "123 456 789";
		sc = new Scanner(src2);
		
		String c = sc.next();
		System.out.println(c);
		
		int i1 =Integer.valueOf(c);
		System.out.println(i1);
		System.out.println(i1*2);
		
		int i2 = sc.nextInt();
		System.out.println(i2);
		
		String src3="hello world\nhello java\nhello spring";
		System.out.println(src3);
		
		sc = new Scanner(src3);
		String line1 = sc.nextLine();
		System.out.println(line1);
		String line2 = sc.nextLine();
		System.out.println(line2);
		String line3 = sc.nextLine();
		System.out.println(line3);
		
		System.out.println("사용자 입력 받기");
		sc = new Scanner(System.in);
		
		String input1 = sc.next();
		System.out.println("입력한 토큰 : " + input1);
		
		int input2 = sc.nextInt();
		
		System.out.println("입력한 두번째 토큰 정수 : " + input2);
		
		sc.nextLine();
		String input3 = sc.nextLine();
		System.out.println("입력한 세번째 문장 : " + input3);
	}

}
