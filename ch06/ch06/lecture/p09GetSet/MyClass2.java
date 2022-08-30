package ch06.lecture.p09GetSet;

public class MyClass2 {
	//별다른 이유가 없다면 필드는 private
	private String name;
	private int age;
	private boolean alive;
	//boolean 타입의 getter는 is로	
	//대신 getter, setter method 공개 (public)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
}
