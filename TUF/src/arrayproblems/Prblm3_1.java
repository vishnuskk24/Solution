package arrayproblems;

public class Prblm3_1 {
//isSorted
//	https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
	 public static int isSorted(int n, int []a) {
	        for(int index=1;index<a.length;index++){
	            if(a[index-1]>a[index]){
	                return 0;

	            }
	        }
	        return 1;
	    }
}
