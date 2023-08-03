package package1;

public class Prblm9 {
 
	// search the elements in rotated sorted array || 
	
	 public boolean search(int[] nums, int target) {
	        
	        for(int n:nums){
	          if(n==target) return true;
	        }
	        return false;
	    }
}
