package package1;

public class Prblm7 {

	 public int search(int[] nums, int target) {
	        
	        int i=0;
	        for(int n:nums){
	            if(n==target){
	                return i;
	            }
	            i++;

	        }
	        return -1;
	    }
}
