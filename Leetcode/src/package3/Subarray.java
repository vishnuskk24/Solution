package package3;

import java.util.ArrayList;
import java.util.List;

public class Subarray {

	
	public static void getAllSubarray(int arr[], List<List<Integer>> rst ) {
		
		for(int i = 0; i<arr.length ; i++) {
			
			for(int j =i;j<arr.length; j++) {
				List<Integer> subArray =  new ArrayList<Integer>( );
				for(int k=i ;k<j ;k++) {
					subArray.add(arr[k]);
					
				}
				rst.add(new ArrayList<>(subArray));
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		
		int arr[]  = {1,2,3,4,5,6};
		List<List<Integer>> rst =  new ArrayList();
		getAllSubarray(arr, rst);
		for(List<Integer> subarray :rst) {
			System.out.println(subarray);
		}
	}
}
