package package2;

import java.util.Arrays;

public class Prblm997 {
// Squares of an Sorted Array
//	https://leetcode.com/problems/squares-of-a-sorted-array/
	public int[] sortedSquares(int[] nums) {
        for(int i  = 0  ; i< nums.length;i++){
            nums[i] =nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
