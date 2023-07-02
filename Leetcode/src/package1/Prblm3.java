package package1;

public class Prblm3 {

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
	  
	  public static void main(String [] args) {
//		  https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/984766526/ 
		  
	  }
}
