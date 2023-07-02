package package1;

public class Prblm2 {

	
	 public int removeElement(int[] nums, int val) {
	        
	        
	        int counter=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]!=val){
	                nums[counter] = nums[i];
	                counter++;
	            }
	        }
	        return counter;

	    }
	 
	 
	 public static void main(String []args) {
		 
//		  url  = >https://leetcode.com/problems/remove-element/submissions/984749188/
	 }
}
