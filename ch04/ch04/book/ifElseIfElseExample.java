package ch04.book;

public class ifElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 100-90 입니다.");
			System.out.println("등급은 A 입니다.");
		}
		else if(score>=80) {
			System.out.println("점수가 80-89 입니다.");
			System.out.println("등급은 B 입니다.");
		}
		else if(score>=70) {
			System.out.println("점수가 70-79 입니다.");
			System.out.println("등급은 C 입니다.");
		}
		else if(score>=60) {
			System.out.println("점수가 60-69 입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}

}
