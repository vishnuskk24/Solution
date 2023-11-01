package arrayproblems;

public class Prblm5 {
	 public static  void reverse(int[] arr, int start,int end){

	        while(start<=end){
	            int temp=arr[start];
	            arr[start]=arr[end];
	            arr[end]=temp;
	            start++;
	            end--;

	        }

	    }
	    public void rotate(int[] nums, int k) {
	        
	       int noOfRotation=k%nums.length;
	    //    1 2 3 4 5 6 7
	    //                 7-3-1
	       reverse(nums,0,nums.length-noOfRotation-1);
	    
	       reverse(nums,nums.length-noOfRotation,nums.length-1);
	    
	       reverse(nums,0,nums.length-1);
	    
	    }
}
