package map;

import java.util.HashSet;
import java.util.Set;

public class Activity2 {

	// first repeative character
	public static void main(String[] args) {
		
		Set<Character> values = new HashSet<>();
		String s = "green apple";
		for(char a :s.toCharArray()) {
			if(values.contains(a)) {
				System.out.println(a);
				break;
			}else {
				values.add(a);
			}
			
		}
		
	}
}
