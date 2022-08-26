package ch04.exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean run = true;
		
		int balance=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택>");
			
			int a = sc.nextInt();
			if(a==1) {
				System.out.print("에금액>");
				balance = sc.nextInt();
				System.out.println();
				
				
			}
			else if(a==2) {
				System.out.print("출금액>");
				balance = balance - sc.nextInt();
				System.out.println();
				
				
			}
			else if(a==3) {
				System.out.print("잔고>");
				System.out.println(balance);
				System.out.println();
			
			}
			else if(a==4) {
				System.out.println();
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}

}
