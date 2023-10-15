package package2;

public class Prblm414 {

//	third maximum number
//	https://leetcode.com/problems/third-maximum-number/
	 public int thirdMax(int[] nums) {
	        Arrays.sort(nums);
	        if(nums.length>=3){
	            int i = nums.length-1;
	            int count  = 3 ;
	            int max=nums[nums.length-1];
	            while(count >0 && i>=0){
	                if(nums[i]==max&& count!=3){
	                    i--;
	                    continue;
	                }
	                if(count ==3 || nums[i]<max){
	                    if(count==1) return nums[i];
	                    max = nums[i];
	                    count--;
	                    i--;
	                }
	            }
	        }
	        return nums[nums.length-1];
	    }
}
