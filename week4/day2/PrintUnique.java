package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUnique {

	public static void main(String[] args) {

		String var = "Thennarasu";
		
		char[] character = var.toCharArray();
		
		Set<Character> setvar = new LinkedHashSet<Character>();
		
		for(Character cha:character) {
		setvar.add(cha);
		
		
		}
		
		System.out.println("Unique charatcters are " +setvar);
	}

}
