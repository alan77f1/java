package w6;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		Set<String> s = new TreeSet<>();

		s.add("Nguyen");
		s.add("Van");
		s.add("An");

//		System.out.println(s);

//		Set<Student> s1 = new TreeSet<>(new ByNameComparator());
		Set<Student> s1 = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		s1.add(new Student("001", "An"));
		s1.add(new Student("003", "Tam"));
		s1.add(new Student("003", "Binh"));

		System.out.println(s1);
	}
}
