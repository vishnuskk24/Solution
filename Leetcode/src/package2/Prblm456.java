package package2;

import java.util.Stack;

public class Prblm456 {

	
	 public boolean find132pattern(int[] nums) {

	        if(nums.length<3) return false;
	        Stack<Integer> st = new Stack();
	        int third=Integer.MIN_VALUE;
	        for(int i = nums.length-1;i>=0;i--){
	            
	            while(!st.isEmpty() && st.peek()<nums[i]){

	                int val = st.pop();
	                if(val>third) third=val;
	                
	            }
	            if(!st.isEmpty() && nums[i] <st.peek() && nums[i]<third)return true;
	            
	            st.push(nums[i]);
	        }

	        return false;
	    }
}
