package package3;

public class Prblm509_2 {

	class Solution {
//		TC - > O(n)
//		SC  - > O(N)   using bottom up approach    0-> n 

		   

	    public int fib(int n) {
	        int[] arr =new int[n+1];
	        if(n<=1) return n;
	        arr[0]=0;
	        arr[1]=1;

	        for(int i=2;i<=n;i++){
	            arr[i]  = arr[i-1]+arr[i-2];   
	        }

	        return arr[n];
	    }
	}
}
