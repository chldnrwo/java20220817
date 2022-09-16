package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C03Map {
	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("seoul", "korea");
		map1.put("busan", "korea");
		map1.put("osaka", "japan");
		map1.put("newyork", "us");
		
		System.out.println(map1);
		//of를 쓰면 수정안되는 맵
		Map<String, String> map2
		=Map.of("seoul", "korea",
				"busan", "korea",
				"osaka", "japan",
				"newyork", "us");
		
		//map2.put("london", "uk");
		//map2.put("busan", "china");
		//map2.remove("osaka");
		
		System.out.println(map2.size());
		System.out.println(map2.containsKey("seoul"));
		System.out.println(map2);
		
		Map<String, String> map3
		=Map.of("cow", "taurus",
				"twins", "gemini",
				"crab", "cancer",
				"lion", "leo",
				"lamb","aris");
		
		System.out.println(map3.size());
		System.out.println(map3);
	}
}
