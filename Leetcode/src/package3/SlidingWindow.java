package package3;

public class SlidingWindow {

	public static void printSubarry(int arr[] , int k) {
		
		if(arr.length<1) {
			return;
		}
		
		int pointer1 =0;
		int pointer2 = pointer1+1;
		int sum=arr[pointer1] +arr[pointer2];
		
		while(pointer2<arr.length && pointer1<pointer2) {
			
			if(sum ==k) {
				System.out.println("[");
				for(int i=pointer1;i<=pointer2 ;i++)
				{	System.out.print(arr[i]);
					if(i<pointer2)System.out.print(",");
						
				}
				System.out.print("]");
				// move the slide
				sum-=arr[pointer1];
				pointer1++;
				sum+=arr[pointer2];
				pointer2++;
				continue;
				
			}
			if(sum<k) {
				sum+=arr[pointer2];
				pointer2++;
			}else {
				sum-=arr[pointer1];
				pointer1++;
						
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int k = 5;
		printSubarry(arr, k);
		
	}
}
