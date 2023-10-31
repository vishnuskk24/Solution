package arrayproblems;

public class Prblm2 {
//	https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
//	second largest and smallest in given array
	    public static int[] getSecondOrderElements(int n, int []a) {
	        // Write your code here.
	        int[] result = {0,0};
	        int small = Integer.MAX_VALUE;
	        int second_small = Integer.MAX_VALUE;
	        int second_large = Integer.MIN_VALUE;
	        int large = Integer.MIN_VALUE;

	        for(int i :a){
	            if(i<small){
	                second_small=small;
	                small =i;
	                
	            }else if(i<second_small && i!=small){
	                second_small=i;
	            }

	            if(i>large){
	                 second_large=large;
	                large=i;
	               
	            }else if(i>second_large && i!=large){
	                second_large=i;
	            }
	        }
	        result[0]=second_large;
	        result[1]=second_small;
	        return result;
	    }

}
