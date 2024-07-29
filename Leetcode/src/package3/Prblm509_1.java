package package3;

import java.util.Arrays;

public class Prblm509_1 {

	class Solution {

	    public int f(int n, int arr[]){
	        if(n<=1) return n;

	        if(arr[n]!=-1) return arr[n];
	        int val = f(n-1,arr)+ f(n-2,arr);
	        arr[n]=val;
	        return val;
	    } 

	    public int fib(int n) {
	        int[] arr =new int[n+1];
	        Arrays.fill(arr, -1);
	        return f(n, arr);
	    }
	}
}
