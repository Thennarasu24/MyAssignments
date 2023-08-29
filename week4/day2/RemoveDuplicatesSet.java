package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesSet {

	public static void main(String[] args) {
		
		String input = "PayPal India";
		
		char[] charArr = input.toCharArray();
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		
		for (char ch : charArr)
			
			if (charSet.contains(ch))
				
				dupCharSet.add(ch);
		
			else 
				charSet.add(ch);		
		
		charSet.removeAll(dupCharSet);
		
		for (char ch : charSet)
			
			if (ch != ' ')
				
				System.out.print(ch);

	 }
		

	}


