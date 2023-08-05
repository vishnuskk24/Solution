package basicmaths;

import java.util.ArrayList;
import java.util.List;

public class Prblm6 {

//	https://takeuforward.org/data-structure/print-all-divisors-of-a-given-number/
	
	    public static List< Integer > printDivisors(int n) {
	        // Write your code here
	        List<Integer> result = new ArrayList<>();
	        for(int i=1;i<=n;i++){
	            if(n%i==0){
	                result.add(i);
	            }
	        }
	        return result;
	    }

	
	public static void main(String[] agrs) {
		
		System.out.println(printDivisors(5));
	}
}
