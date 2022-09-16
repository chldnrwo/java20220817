package ch13.lecture.p04genericMethod;

import java.util.Arrays;
import java.util.List;

public class C02Method {
	List<String> list1 = Arrays.<String>asList("java","spring","jsp");
	List<Integer> list2 = Arrays.<Integer>asList(99,100,200);
	
	List<String> list3 = Arrays.<String>asList("topgun","thor","ironman");
	List<Integer> list4 = Arrays.<Integer>asList(99,100,300);
}
