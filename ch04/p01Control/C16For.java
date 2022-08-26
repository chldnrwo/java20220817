package p01Control;

import java.util.Scanner;

public class C16For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.println("마지막 정수 입력 : ");
		int last = sc.nextInt();
		
		int sum=0;
		
		for(int i=first;i<=last;i++) {
			sum+=i;
		}
		System.out.println(first+"부터 "+last+"까지 합 : "+sum);
	}

}
