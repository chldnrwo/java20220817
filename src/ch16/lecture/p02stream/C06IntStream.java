package ch16.lecture.p02stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class C06IntStream {
	public static void main(String[] args) {
		
		int a = IntStream.rangeClosed(1, 10).sum();
		System.out.println(a);
		
		int b = IntStream.rangeClosed(1, 100).sum();
		System.out.println(b);
		
		int c = IntStream.rangeClosed(1, 100)
				.filter(e->e%2!=0)
				.sum();
		System.out.println(c);
		
		OptionalDouble d = IntStream.of(5,10,20,1,6)
				.average();
		System.out.println(d.getAsDouble());
		
		IntStream.generate(()->(int)(Math.random()*6)+1)
			.limit(5)
			.forEach(e->System.out.println(e));
		
		IntStream.generate(()->(int)(Math.random()*45)+1)
			.distinct()
			.limit(6)
			.forEach(e->System.out.println(e));
				
	}
}
