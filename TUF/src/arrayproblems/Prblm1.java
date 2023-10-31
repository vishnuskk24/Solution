package arrayproblems;

public class Prblm1 {
//	longest element in array
//	https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int largest = 0;
        for(int i:arr){
            if(largest<i)largest=i;
        }
        return largest;

    }
	
}
