package arrayproblems;

import java.util.ArrayList;

public class Prblm10_2 {
//	 intersectio of Two sorted array
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		ArrayList<Integer> Result =  new ArrayList();
		int size1=arr1.size();
		int size2=arr2.size();
		int i=0;
		int j=0;
		while(i<size1 && j<size2){
			if(arr1.get(i)<arr2.get(j)){
				i++;
			}else if(arr1.get(i)>arr2.get(j)){
				j++;
			}
			else{
				Result.add(arr1.get(i));
				i++;
				j++;
			}

		}


		return Result;

	}

}
