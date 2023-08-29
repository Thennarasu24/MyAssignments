package week3.day4;

public class CountOfChar {

	public static void main(String[] args) {

		String str = "Testleaf";
		int count = 0;
		char[] cha = str.toCharArray();
		for (int i = 0; i < cha.length; i++)
			if (cha[i] == 'e')
				count++;
		System.out.println(count);

	}
	
	
 
}
