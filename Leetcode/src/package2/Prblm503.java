package package2;

public class Prblm503 {

//	 brute force 
//	https://leetcode.com/problems/next-greater-element-ii/
	public int[] nextGreaterElements(int[] nums) {

        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            boolean flag = true;
            int j=i+1;
           
            while(j%nums.length!=i){

                if(nums[i]<nums[j%nums.length]){
                    result[i] = nums[j%nums.length];
                    flag=false;
                    break;
                }
                j++;

            }
            if(flag){
                result[i] = -1;
            }
        }
        return result;
        
    }
}
