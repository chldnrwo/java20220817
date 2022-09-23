package ch16.lecture.p02stream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C02TerminalOperation {
	public static void main(String[] args) {
		// stream 연산
		// 1. 중간 연산(중간 처리) intermediate operation
		// 2. 종료 연산(최종 처리) terminal operation
		
		// 구분법 : 중간 연산 (method)은 리턴 타입이 stream
		// 			최종 연산 (method)는 리턴 타입이 stream이 아님(주로)
		
		Stream<String> stream1 = List.of("java","css","spring","jsp","html").stream();
		
		Optional<String> option1 = stream1.findAny();
		
		System.out.println(option1.orElse("없네요."));
		
		
		
		//findFirst : 첫번째 element
		
		Stream<String> stream2 = List.of("java","css","spring","jsp","html").stream();
		Optional<String> option2 = stream2.findFirst();
		
		System.out.println(option2.orElse("없네요."));
		//stream은 종료연산 이후에 재사용이 안된다.
		
		//max 가장 큰 element
		Stream<String> stream3 = List.of("java","css","spring","jsp","html").stream();
		Optional<String> option3 = stream3.max((a,b)->a.compareTo(b));
		System.out.println(option3.get());
		
		//min 가장 작은 element
		Stream<String> stream4 = List.of("java","css","spring","jsp","html").stream();
		Optional<String> option4 = stream4.min((a,b)->a.compareTo(b));
		System.out.println(option4.get());
		
		//
		IntStream stream5 = IntStream.of(100,200,50,-50,7,6,9);
		OptionalInt option5 = stream5.max();
		System.out.println(option5.getAsInt());
		
		IntStream stream6 = IntStream.of(100,200,50,-50,7,6,9);
		OptionalInt option6 = stream6.min();
		System.out.println(option6.getAsInt());
		
	}
}
