package ch13.book.s1304;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}	
