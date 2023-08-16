package week2.day1;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		int len = arr.length;

		Arrays.sort(arr);

		for (int i = 0; i < len; i++) {
			int j = i + 1;

			if (j != arr[i]) {

				System.out.println(j);
				break;

			}
		}

	}

}
