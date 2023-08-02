package package1;

public class Prblm8 {

// get minimum in an sorted array
	
	    public int findMin(int[] nums) {
	        int min=min=nums[0];
	        
	        for(int n:nums){
	            if(min>n){
	                min=n;
	            }
	        }
	        return min;
	    }
	
}
