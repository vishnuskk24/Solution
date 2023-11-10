package package2;

public class Prblm31 {
	 public static void reverse(int []arr,int begin,int end){
	        if(end<begin){
	            System.out.println("end -->" + end + "start - > " + begin);
	            return;
	        }
	        int temp=arr[begin];
	        arr[begin]=arr[end];
	        arr[end]=temp;
	        reverse(arr,begin+1,end-1);
	    }
	    public void nextPermutation(int[] nums) {
	        int breakPoint=-1;
	        for(int i = nums.length-2 ; i>=0;i--){
	            if(nums[i]<nums[i+11]){
	                breakPoint=i;
	                break;
	            }
	        }
	        if(breakPoint==-1){
	            System.out.println("break point is - 1 so reverse");
	            reverse(nums,0,nums.length-1);
	            System.out.println("above return");
	            return;
	        }

	         System.out.println("after return");
	        int leastGreater=-1;
	        for(int i=nums.length-1;i>breakPoint;i++){
	            if(nums[i]>nums[breakPoint]){
	                int temp=nums[breakPoint];
	                nums[breakPoint] = nums[i];
	                nums[i]=temp;
	                break;
	                
	            }
	        }
	         for(int i:nums){
	            System.out.print(i+",");

	        }
	        System.out.println();
	        reverse(nums,breakPoint+1,nums.length-1);
	         for(int i:nums){
	            System.out.print(i+",");

	        }
	        return;
	    }
}
