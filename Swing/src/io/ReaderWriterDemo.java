package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReaderWriterDemo {
	public static void save(List<Student> sts, String filename) throws IOException {
		
		PrintWriter w = new PrintWriter(filename);
		
		for(Student st : sts) {
			w.println(st);
		}
		
		w.close();

	}

	public static List<Student> load(String filename) throws IOException {
		List<Student> sts = new ArrayList<>();

		BufferedReader re = new BufferedReader(new FileReader(filename));
		while (true) {
			String line = re.readLine();
			if (line == null)
				break;
			StringTokenizer tokens = new StringTokenizer(line, " ");
			int id = Integer.parseInt(tokens.nextToken());
			String name = tokens.nextToken();
			double gpa = Double.parseDouble(tokens.nextToken());
			sts.add(new Student(id, name, gpa));
		}
		re.close();
		
		return sts;
	}

	public static void main(String[] args) throws IOException {
//		String line = "1 An 5.9";
//		StringTokenizer tokens = new StringTokenizer(line, " ");
//
//		while (tokens.hasMoreTokens()) {
//			System.out.println(tokens.nextToken());
//		}
		String filename = "D:\\dssinhvien.txt";
//		Student st1 = new Student(1, "An", 8.5);
//		Student st2 = new Student(2, "Binh", 9.5);
//		Student st3 = new Student(3, "Bao", 7.5);
//		
//		List<Student> sts = new ArrayList<>();
//		sts.add(st1);sts.add(st2);sts.add(st3);
//		
//		save(sts, filename);
		
		List<Student> sts1 = load(filename);
		
		System.out.println(sts1);
	}
}
