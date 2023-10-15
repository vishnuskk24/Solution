package package2;

import java.util.ArrayList;
import java.util.List;

public class Prblm448 {
//	Find all Disappeared number in array
//	https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

	 public List<Integer> findDisappearedNumbers(int[] nums) {
	        List<Integer> result = new ArrayList<>();
	        for(int i =0 ; i<nums.length;i++){
	            int index = Math.abs(nums[i])-1;
	            if(nums[index]>0){
	                nums[index]*=-1;
	            }
	        }
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]>0){
	                result.add(i+1);
	            }
	        }
	        return result;
	        
	    }
}
