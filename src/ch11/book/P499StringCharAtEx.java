package ch11.book;

public class P499StringCharAtEx {
	public static void main(String[] args) {
		String ssn = "123450-123450";
		char sex = ssn.charAt(7);
		switch (sex) {
		case'1':
		case'3':
			System.out.println("남자입니다.");
			break;
		case'2':
		case'4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
