package p01Control;

import java.util.Scanner;

public class C17While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("(주사위 맞추기)");
		
		
		while(true) {
			System.out.println();
			System.out.print("번호를 입력하세요(1~6) : ");
			
			int user = sc.nextInt();
			
			int d =(int)(Math.random()*6)+1;
			
			System.out.println("주사위 결과 : "+d);
			
			if(user==d) {
				System.out.println();
				System.out.println("===============맞았습니다!=============");
				break;
			}
			else {
				System.out.println();
				System.out.println("===============틀렸습니다!==============");
			}
		}
	}

}
