package package3;

public class Prblm509_3 {

	class Solution {

		   

	    public int fib(int n) {
	       if(n<=1) return n;
	       int prev2=0;
	       int prev =1;


	        for(int i=2;i<=n;i++){
	            int val= prev2+prev;
	            prev2=prev;
	            prev=val;
	        }

	        return prev;
	    }
	}
}
