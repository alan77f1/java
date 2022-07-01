package w6;

public class Student implements Comparable<Student> {
	private String id;
	private String name;

	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

	@Override
	public int compareTo(Student o) {
//		int re = id.compareTo(o.id);
//		if (re != 0)
//			return re;
//		else
			return name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		return this.id + " " + this.name;
	}

}
