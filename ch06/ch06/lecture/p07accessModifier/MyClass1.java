package ch06.lecture.p07accessModifier;

public class MyClass1 {
	// 필드
	// 접근 제한자 생략하면 같은 패키지 내에서 사용 가능
	// package private(default)
	public String name;
	
	// public : 다른 패키지에서도 사용가능
	public int age;
	
	//private : 클래스 내에서만 사용가능
	private String secret;
	
	// 생성자
	
	// 메소드
	// 접근제한자 생략하면 같은패키지내에서 사용 가능
	void printName() {
		System.out.println(name);
	}
	public void printAge() {
		System.out.println(age);
	}
	
	
	public void printSecret() {
		System.out.println(secret);
	}
	public void setSecret(String secret) {
		// TODO Auto-generated method stub
		this.secret=secret;
	}
}
