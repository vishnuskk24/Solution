package package2;

public class Prblm10 {
//	https://leetcode.com/problems/container-with-most-water/description/
//	container with most water
	 public static int min(int a, int b){
	        return (a>b)?b:a;
	    }
	    public int maxArea(int[] height) {        
	        int maxArea =0;
	        int i =0;
	        int j =height.length-1;
	        while(i<=j){
	            int area=0;            
	            area=(j-i)*min(height[i],height[j]);
	            maxArea=(area>maxArea)?area:maxArea;
	            if(height[i]>height[j]){
	                j--;
	            }else{
	                i++;
	            }
	        }
	        return maxArea;
	    }
}
