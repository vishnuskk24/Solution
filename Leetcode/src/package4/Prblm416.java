package package4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prblm416 {
	

	class Solution {

	    public boolean checkseq(int index, int sum, int[] nums, int total,int[][] dp){


	        if(total-sum==sum) return true;   // (total sum - current seq sum ) -> remaining sum == currentsum which means we can divide equally
	        if(index ==nums.length) return false;

	        if(dp[index][sum]!=-1) return dp[index][sum]==1;

	        boolean notTake = checkseq(index+1,sum, nums,total,dp);

	        boolean take = false;

	        if(sum+nums[index]<=total/2){ // take the current element only if the current sequence sum is  less thanor equals half of the total sum
	            take = checkseq(index+1,sum+nums[index], nums,total,dp);

	        }

	        dp[index][sum]=(take || notTake)?1:0;
	        return take || notTake;

	    }
	    public boolean canPartition(int[] nums) {

	        
	        int total = 0;

	        for(int i: nums)total+=i;
	        int dp[][] = new int[nums.length][(total/2)+1];

	        for(int[] dpp: dp) Arrays.fill(dpp,-1);
	        return checkseq(0,0,nums,total,dp);
	        
	    }
	}
}
