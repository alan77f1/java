package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Student {
	private int id;
	private String name;
	private double gpa;

	public Student(int id, String name, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	public void save(String filename) throws IOException {
		DataOutputStream out = new DataOutputStream(new FileOutputStream(filename));
		out.writeInt(id);
		out.writeUTF(name);
		out.writeDouble(gpa);
		out.close();
	}

	public static Student load(String filename) throws IOException {
		DataInputStream in = new DataInputStream(new FileInputStream(filename));
		int id = in.readInt();
		String name = in.readUTF();
		double gpa = in.readDouble();
		in.close();
		return new Student(id, name, gpa);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " + this.name + " " + this.gpa;
	}
}
