package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOp {
// Vo Doan Hoang Long
	public static void copyFile(String source, String des) throws IOException {
//		InputStream in = new FileInputStream(source);
//		OutputStream out = new FileOutputStream(des);
		
		InputStream in = new BufferedInputStream (new FileInputStream(source));
		OutputStream out = new BufferedOutputStream(new FileOutputStream(des));
		byte b[] = new byte[100];
		long begin = System.currentTimeMillis();
		while (true) {
			int data = in.read(b);
			if (data == -1)
				break;
			out.write(b, 0, data);

		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-begin);
		in.close();
		out.close();
	}

	public static boolean deleteDir(String path) {
		File f = new File(path);
		if (f.isFile())
			return f.delete();
		else {
			File[] children = f.listFiles();
			if (children.length == 0)
				return f.delete();
			else {
				boolean re = true;
				for (File fi : children) {
					re &= deleteDir(fi.getAbsolutePath());
				}
				re &= f.delete();
				return re;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		String src = "D:\\ZUS T7.rar";
		String des = "D:\\copy.rar";

		copyFile(src, des);

//		System.out.println(deleteDir(path));
	}
}
