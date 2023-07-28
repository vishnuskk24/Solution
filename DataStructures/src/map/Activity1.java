package map;

import java.util.HashMap;
import java.util.Map;

public class Activity1 {

	public static char findFirstNonRepetiveChracter(String input) {
		
		char result = 0;
		Map<Character, Integer> pair = new HashMap<>();
		
		for(Character c : input.toCharArray()) {
			
			var count = pair.containsKey(c) ? pair.get(c) : 0;
			
			pair.put(c,count+1);
			
		}
		
		for(Character c:input.toCharArray()) {
			if(pair.get(c)==1) {
				return c;
			}
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		
		String input= "apple is read";
		System.out.println(findFirstNonRepetiveChracter(input));
	}
}
