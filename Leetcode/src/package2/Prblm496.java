package package2;

public class Prblm496 {
//	https://leetcode.com/problems/next-greater-element-i/description/s
//	Brute force approach
	
	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        
	        int[] result  =  new int[nums1.length];

	        for(int i=0;i<nums1.length;i++){
	            boolean flag = true;
	                int elementIndex = 0;
	            for(int j=0;j<nums2.length;j++){
	                if(nums2[j]==nums1[i]){
	                    elementIndex=j;
	                    break;
	                }

	            }
	            for(int j=elementIndex;j<nums2.length;j++){
	                if(nums1[i]<nums2[j]){
	                    result[i] =nums2[j];
	                    flag=false;
	                    break;
	                }

	            }
	            if(flag){
	                    result[i]=-1;
	            }



	        }
	      return result;
	    }
}
