package package2;

public class Prblm1480 {
//	link -> https://leetcode.com/problems/running-sum-of-1d-array/description/
	
	  public int[] runningSum(int[] nums) {

	        int[] result = new int[nums.length];
	        int length = nums.length;
	     
	        for(int i = 0;i<length;i++){
	            int sum=0;
	            for(int j=0;j<=i;j++){
	                sum=sum+nums[j];

	            }
	            
	            result[i] = sum;
	           
	        }
	        return result;
	        
	    }

}
