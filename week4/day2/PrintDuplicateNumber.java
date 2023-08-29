package week4.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumber {

	public static void main(String[] args) {
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<data.length;i++) {
			
			if (set.contains(data[i])) {
				
				System.out.println(data[i]);
				
			}
			
			else {
				
				set.add(data[i]);
			}

		}
	}

}
