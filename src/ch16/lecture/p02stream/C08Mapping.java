package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C08Mapping {
	public static void main(String[] args) {
		//IntStream (primitive type stream)->Stream<Integer>
		
		IntStream.of(3,5,9,1,0)
				.boxed()
				.sorted()
				.forEach((e)->System.out.print(e+" "));
		
		//
		System.out.println();
		
		IntStream.of(3,5,9,1,0)
			.boxed()
			.sorted((a,b)->b-a)
			.forEach((e)->System.out.print(e+" "));
	}
}
