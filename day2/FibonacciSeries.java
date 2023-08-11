package week1.day2;

/*
 * Goal: To find Fibonacci Series for a given range
 * 
 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
 * 
 * 
 * What are my learnings from this code? 1) 2) 3)
 * 
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;

		System.out.println("Fibonacci Series is " + '\n' + +firstNum + '\n' + secNum);

		for (int j = 2; j < range; ++j) {

			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;

		}
	}

}
