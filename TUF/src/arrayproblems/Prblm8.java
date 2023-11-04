package arrayproblems;

public class Prblm8 {
//	prblm268
//	https://leetcode.com/problems/missing-number/submissions/
		//Missing numbers
	public int missingNumber(int[] nums) {
        int N=nums.length;

        int sum=(N*(N+1))/2;
        int givenSum=0;
        for(int i: nums){
            givenSum+=i;
            
        }
        return sum-givenSum;
    }
}
