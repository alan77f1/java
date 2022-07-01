package w6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

import w3.Circle;
import w3.Point;

public class Test {

	public static boolean search(int[] arr, int i) throws IndexOutOfBoundsException {
		if (i <= 0 || i == arr.length)
			throw new ArrayIndexOutOfBoundsException("Sai vi tri");
		else
			return true;
	}

	public static void main(String[] args) {
//		Object[] arr = new String[3];
//		arr[0] = "123";
//		arr[1] = 123;
//		try {
//			int a = Integer.parseInt("mot");
//			int[] arr = { 1, 2, 3 };
//			System.out.println(arr[3]);
//		} catch (ArrayIndexOutOfBoundsException ex) {
//			System.err.println("Sai vi tri");
//		} catch (Exception ex) {
//			System.err.println("Sai dinh dang");
//		} finally {
//			System.out.println("Finally.");
//		}
//
//		System.out.println("End.");

		// Generic
		ArrayList<Integer> col = new ArrayList<Integer>();
		col.add(1);
		col.add(2);
		col.add(3);
// for i 
		for (int i = 0; i < col.size(); i++) {
			System.out.print(col.get(i) + " ");
		}
		System.out.println();
		// for each
		for (Integer i : col) {
			System.out.print(i + " ");
		}
		System.out.println();
// iterator
		ListIterator<Integer> iter = col.listIterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		LinkedList<Integer> sts = new LinkedList<Integer>();
		
		sts.addFirst(100);
		sts.add(10);
		sts.get(0);
		System.out.println(sts);
		
		Vector<Integer> vector = new Vector<>();
		
		
	}
}
