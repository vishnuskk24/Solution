package hashing;

import java.util.HashMap;
import java.util.Map;

public class Prblm4 {

	   public static void main(String args[]) {

	        int arr[] = {10, 5, 10, 15, 10, 5};
	        int n = arr.length;
	        Frequency(arr, n);
	    }
	    static void Frequency(int arr[], int n) {
	        Map<Integer, Integer> map = new HashMap<>();

	        for (int i = 0; i < n; i++) {
	            if (map.containsKey(arr[i])) {
	                map.put(arr[i], map.get(arr[i]) + 1);
	            } else {
	                map.put(arr[i], 1);
	            }
	        }

	       
	    }
}
