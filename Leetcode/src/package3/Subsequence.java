package package3;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

	public static void getCombination(List<List<Integer>> rst, int index, List<Integer> current, int []arr,int k,int sum) {
		
		if(index >= arr.length) {
			if(k==sum)	rst.add(new ArrayList<Integer>(current));
			return;
		}
		current.add(arr[index]);
		getCombination(rst, index+1, current, arr,k,sum+arr[index]);
		current.remove(current.size()-1);
		getCombination(rst, index+1, current, arr,k,sum);
		
		
	}
	public static void main(String[] args) {
		
		int []arr = {1,2,2,3};
		List<List<Integer>> rst = new ArrayList();
		int k=4;
		getCombination(rst, 0, new ArrayList<>(), arr,k,0);
		for(List<Integer> subseq:rst) {
			System.out.println(subseq);
			
		}
	}
}

// Combination sum k