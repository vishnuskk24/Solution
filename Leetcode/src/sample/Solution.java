package sample;

import java.util.Arrays;

public class Solution {

	 public int f(int i, int[] height,int dp[]){
	        
		 
		 if(i==0) return 0;
		 
		 if(dp[i]!=-1) return dp[i];
         // Base case: if the frog is at the 0th stair, no energy is required
		 
		 int left = f(i-1,height,dp)+Math.abs(height[i]-height[i-1]);
		 
		 if(i>1) {
			 int right = f(i-2,height,dp)+Math.abs(height[i-2]-height[i]);
			 left=left<right?left:right;
		 }
		 dp[i]=left;
		 return left;
		
		
		 
	}
	public int minimumEnergy(int arr[],int N,int[] dp){
		return f(N,arr,dp);
	}
	
	
	public static void main(String[] args) {
		
		int[] height={30,10,60,10,60,50};
		int dp[] =  new int[height.length];
		Arrays.fill(dp,-1);
		
		System.out.println(new Solution().minimumEnergy(height, height.length-1,dp));
		
	}
}
