package java20220817.book.Exercise.exercise5;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		//가장 앞에서 슈퍼클래스로 부모클래스를 초기화해줘야한다.
		this.name =name;
		this.studentNo=studentNo;
	}
	
}
