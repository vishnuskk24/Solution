package arrayproblems;

public class Prblm4 {
//	https://www.codingninjas.com/studio/problems/left-rotate-an-array-by-one_5026278?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//	rotate array by one place
	
	 static int[] rotateArray(int[] arr, int n) {
	        // Write your code here.
	        
	        int lastValue = arr[0];
	        for(int i = 0;i<n-1;i++){
	            arr[i]=arr[i+1];

	        }
	        arr[arr.length-1]=lastValue;
	        return arr;

	    }

}
