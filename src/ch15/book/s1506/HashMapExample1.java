package ch15.book.s1506;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: "+map.size());
		
		System.out.println("\t홍길동 : "+map.get("홍길동"));
		System.out.println();
		
		Set<String> keySet = map.keySet(); //key값을 다받아옴
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry1 : entries){
			System.out.println(entry1.getKey()+" : "+entry1.getValue());
		}
		System.out.println();
		
		map.forEach((k,v) ->System.out.println(k+" : "+v));
		
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수: "+map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); //key랑 value를 다 받아옴
		Iterator<Map.Entry<String, Integer>> entryIterator =entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+ key+" : "+value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수: "+map.size());
		
	}
}
