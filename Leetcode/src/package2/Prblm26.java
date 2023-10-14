package package2;

public class Prblm26 {
//	https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3258/
// Remove Duplicates from Sorted Array
	 public int removeDuplicates(int[] nums) {
	        int count=0;
	        for(int i=0;i<nums.length;i++){

	            if(nums[count] != nums[i]){
	                count++;  
	                nums[count] = nums[i];
	                
	                
	            }
	        }
	        return count+1;
	    }
}
