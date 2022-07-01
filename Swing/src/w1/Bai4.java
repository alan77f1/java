package w1;

import java.util.Arrays;
import java.util.Scanner;
// Vo Van Tri: +
public class Bai4 {

	public static int[][] transpose(int[][] a) {
		int[][] re = new int[a[0].length][a.length];
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				re[j][i] = a[i][j];
			}
		}
		
		return re;
	}

	public static void main(String[] args) {
		int[][] a = {{1, 2}, {3, 4}, {5, 6}};
		System.out.println(Arrays.deepToString(a));
		
		System.out.println(Arrays.deepToString(transpose(a)));
		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhap so phan tu: ");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			System.out.print("Nhap phan tu " + (i + 1) + ": ");
//			arr[i] = sc.nextInt();
//		}
//		for (int i = n - 1; i >= 0; i--) {
//			System.out.print(arr[i] + " ");
//		}
//		sc.close();
	}
}
