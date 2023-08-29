package week3.day4;

public class LearnString {

	public static void main(String[] args) {

		String input = "Thennarasu";
		
		char[] arr = input.toCharArray();
		
		for(int i =arr.length-1; i>=0;i--) {
			System.out.println(arr[i]);
		}

	}

}
