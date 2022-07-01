package w1;

import java.util.Arrays;

public class SubMain {
//	public final void testMethod1() {
//		System.out.println(PI+" "+PI);
//	}

//	public static void swap(int a, int b) {
//		int c = a;
//		a = b;
//		b = c;
//	}
	public static void modify(int[] arr) {
		arr[0] = 100;
	}

	public static String exampleOfSwitch(String animal) {
		String result;
		switch (animal) {
		case "DOG":
		case "CAT":
			result = "domestic animal";
			break;
		case "TIGER":
			result = "wild animal";
			break;
		default:
			result = "unknown animal";
			break;
		}
		return result;
	}

	public static void main(String[] args) {
//		int[] array0 = new int[1];
//		int[] array2 = { 1, 2, 3, 4, 5 };

//		System.out.println(array2[5]);
		Object[] array3 = new String[2];
		array3[0] = "UTC2";
		array3[1] = 100;// ???
		
//		System.out.println(exampleOfSwitch("DOG"));

	}
}
