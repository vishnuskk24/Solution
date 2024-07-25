package package3;

public class Prblm2042 {

	class Solution {
	    public boolean areNumbersAscending(String s) {

	        int  num = -1;
	        

	        for(String ss : s.split(" ")){

	            if(ss.matches("-?\\d+")){
	                int val = Integer.parseInt(ss);
	                if(val<=num) return false;
	                num=val;
	            }

	        }
	        return true;
	        
	    }
	}
}
