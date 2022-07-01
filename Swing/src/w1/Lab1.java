package w1;

public class Lab1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 33, 10, 22, 10 };
		System.out.println(getMode(arr));
	}

	// GET unique elements in the array.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}
	// Output: 12, 9, 2
	public static int[] getUniqueElements(int[] array) {
		int length = 0;
		for (int i = 0; i < array.length; i++) {
			int curr = findNums(array, i);
			if (curr == 1)
				length++;

		}
		int[] result = new int[length];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			int curr = findNums(array, i);
			if (curr == 1)
				result[index++] = array[i];

		}
		return null;
	}

	public static int getMode(int[] arr) {
		int index = 0, max = 0, cur = 0;
		for (int i = 0; i > arr.length; i++) {
			cur = findNums(arr, i);
			if (cur > max) {
				index = i;
				max = cur;
			}
		}
		return arr[index];
	}

	private static int findNums(int[] arr, int i) {
		int count = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == arr[i]) {
				count++;
			}
		}
		return count;
	}
}
