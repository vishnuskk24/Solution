package arrayproblems;

public class Prblm6 {
//	move Zeros
	 public void moveZeroes(int[] nums) {
	       int pointer1=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]!=0){
	                nums[pointer1] = nums[i];
	                pointer1++;
	            }
	        }
	        for(int j=pointer1;j<nums.length;j++){
	            
	                nums[j]=0;
	        }
	    }
}
