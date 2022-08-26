package ch04.exercise;

public class Exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<5;i++) {
			//System.out.print("*");
			for(int j = 0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for(int i = 0;i<5;i++) {
			//System.out.print("*");
			for(int j = 0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
