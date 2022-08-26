package p01Control;

import java.util.Scanner;
//ctrl Shift o = 추가 단축키
public class C18GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컴퓨터가 1~100 랜덤값 갖기
		//
		Scanner sc = new Scanner(System.in);
		
		
		int com = (int)(Math.random()*100)+1;
		
		
		
		while(true) {
			int user = sc.nextInt();
			
			if(user>com) {
				System.out.println("좀 더 작습니다.");
			}
			else if(user<com) {
				System.out.println("좀 더 큽니다.");
			}
			else if(user==com) {
				System.out.println("정답입니다.");
				break;
			}
			
		}
	}

}
