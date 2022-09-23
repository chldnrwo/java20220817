package ch16.book.exercise.Exercise5;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		list.stream()
			.sorted((x,y)->x.length()-y.length())
			.skip(1)
			.forEach(a->System.out.println(a));
	}
}
