package io;

import java.io.IOException;

public class DataInOutStudent {
	public static void main(String[] args) throws IOException {
		String filename = "D:\\sinhvien.txt";
//		Student st = new Student(1, "An", 9.5);
//		
//		st.save(filename);

		Student s = Student.load(filename);

		System.out.println(s);
	}
}