package ch13.book.exercise.Exercise3;

public class Container<T, U> {
	private T t;
	private U u;
	
	public T getKey() {return this.t;}
	public U getValue() {return this.u;}
	
	public void set(T t, U u) {
		this.t=t;
		this.u=u;
	}
}
