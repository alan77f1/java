package w6;

import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Student, Integer> map = new TreeMap<>();
		
		map.put(new Student("001", "Binh"), 1);
		map.put(new Student("003", "An"), 5);
		map.put(new Student("002", "Bao"), 2);
		
		System.out.println(map);
	}
}
