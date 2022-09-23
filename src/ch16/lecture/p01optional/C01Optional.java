package ch16.lecture.p01optional;

import java.util.Optional;

public class C01Optional {
	public static void main(String[] args) {
		Optional<String> obj1 = Optional.empty();
		Optional<String> obj2 = Optional.of("java");
		
		System.out.println(obj1.isEmpty());
		System.out.println(obj2.isEmpty());  //값이 비어있으면 true 반환

		System.out.println(obj1.isPresent());
		System.out.println(obj2.isPresent());	//값이 있으면 true 반환
		
		String str2 = obj2.get();
		System.out.println(str2);
		
		//String str1 = obj1.get();
		//System.out.println(str1); //Exception 발생
		
		String str1 = obj1.orElse("empty string"); //값이 비어있을때 나오는 것
		System.out.println(str1); //값이 비어있기 때문에 "empty string"
		System.out.println(obj2.orElse("empty string")); //값이 있기 떄문에 "java"를 꺼내줌
	}
}
