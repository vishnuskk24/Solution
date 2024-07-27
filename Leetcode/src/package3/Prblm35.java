package package3;

public class Prblm35 {

	class Solution {
	    public int searchInsert(int[] nums, int target) {
	        
	        int start=0;
	        int end=nums.length-1;
	        while(start<=end){
	            int mid =(start+end)/2;
	            if(nums[mid]==target) return mid;
	            
	            else if(target>nums[mid]){
	                    start=mid+1;
	            }
	            else{
	                end=mid-1;
	            }
	        }
	        return end+1;
	    }
	}
}
