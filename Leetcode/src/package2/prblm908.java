package package2;

public class prblm908 {
//	https://leetcode.com/problems/sort-array-by-parity/submissions/1074932608/
//	sort array by parity
	 public int[] sortArrayByParity(int[] nums) {
	        int pointer2=nums.length-1;
	        for(int i=0;pointer2>i;){
	            if(nums[i]==0 || nums[i]%2==0){
	                i++;continue;
	            }
	            if(nums[pointer2]%2!=0){
	                pointer2--;
	                continue;
	            }
	            int temp = nums[pointer2];
	            nums[pointer2] = nums[i];
	            nums[i] = temp;
	            i++;pointer2--;
	        }
	        return nums;
	    }
}
