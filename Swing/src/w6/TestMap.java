package w6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("To1", 20);
		map.put("To2", 35);
		map.put("To3", 30);
		map.put("To4", 25);
		map.put(null, 25);
		
		System.out.println(map);
		
		Set<Entry<String, Integer>> entries = map.entrySet();
		for(Entry<String, Integer> entry : entries) {
			System.out.print(entry.getKey()+" "+entry.getValue()+", ");
		}
		
//		Set<String> keys = map.keySet();
//		Iterator<String> iter = keys.iterator();
//		for(String key : keys) {
//			System.out.print(map.get(key)+" ");
//		}
//		System.out.println();
//		while(iter.hasNext()) {
//			System.out.print(map.get(iter.next())+" ");
//		}
	}
}
