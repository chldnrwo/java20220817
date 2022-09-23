package ch16.book.s1602;

public class Member {
	private String name;
	private String id;
	
	public Member(String name, String id) {
		System.out.println("Member(String name, String id)");
		this.name = name;
		this.id = id;
	}

	public Member(String id) {
		System.out.println("Member(String id) 실행");
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
}
