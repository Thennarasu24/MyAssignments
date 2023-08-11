package week1.day2;

/*
 * Goal: Find the Factorial of a given number
 * 
 * input: 5 output: 5*4*3*2*1 = 120
 * 
 * 
 * What are my learnings from this code? 
 * 1) Need to understand the question
 * 2) Write a Pseudo code
 * 3) Debug and check for any doubts
 * 
 */
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;
		int fact = 1;

		for (int i = 1; i <= input; i++) {

			fact = fact * i;
		}

		System.out.println("Factorial of the Given Number is " + fact);
	}

}
