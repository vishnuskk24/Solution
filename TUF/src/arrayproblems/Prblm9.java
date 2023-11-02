package arrayproblems;

public class Prblm9 {
	
//	https://leetcode.com/problems/single-number/description/
//	Single number
	 public int singleNumber(int[] nums) {
	        
	        int xor=0;
	        for(int i : nums){
	            xor=xor^i;
	        }
	        return xor;
	    }

}
