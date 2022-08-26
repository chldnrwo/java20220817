package ch04.exercise;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		
		int A=0;
		int B=0;
		
		while(A+B!=5) {
			A = (int)(Math.random()*6)+1;
			B = (int)(Math.random()*6)+1;
			
			System.out.println("("+A+","+B+")");
		}
	}

}
