package week1.day2;

public class NegativeToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int negativenum = -40;

		if (negativenum < 0) {
			System.out.println("The Number is Negative = " + negativenum);

			negativenum = -negativenum;
			System.out.println("Number changed from Negative to Positive = " + negativenum);
		}

		else {
			System.out.println("The Number is Positive = " + negativenum);
		}
	}

}
