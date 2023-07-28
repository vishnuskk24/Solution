package package1;

import java.util.HashMap;
import java.util.Map;

public class Prblm5 {

	  public static Integer getFirstNonRepeativeCharacter(String s){
	        int index=-1;

	        Map<Character,Integer> pair = new HashMap();
	        for(char c :s.toCharArray()){
	            
	            var count = pair.containsKey(c)?pair.get(c):0;

	            pair.put(c,count+1);   
	        }
	            int i=0;
	        for(char c :s.toCharArray()){
	            if(pair.get(c)==1){
	                return i;
	            }
	            i++;

	        }
	        return index;
	    }
	    public static int firstUniqChar(String s) {
	        
	        return getFirstNonRepeativeCharacter(s);
	    }
	
	public static void main(String[] args) {
		
		String s="google";
		System.out.println(firstUniqChar(s));
	}
}
