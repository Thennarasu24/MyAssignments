package week2.day1;

import java.util.Arrays;

public class FindSecondLargestNum {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		int len = data.length;

		for (int i = 0; i < len - 1; i++) {

			Arrays.sort(data);

		}
		System.out.println("Second Largest num is " + data[len - 2]);

	}

}
