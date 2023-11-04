package arrayproblems;

public class Prblm3_2 {

//	https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/submissions/
//	check if the array is sorted ad rotated
	 public boolean check(int[] nums) {
	        int count=0;
	        for(int index=0;index<nums.length;index++){
	            if(nums[index]>nums[(index+1) % nums.length]){
	                count++;

	            }
	            if(count>1) return false;
	        }
	        return true;
	    }
}
