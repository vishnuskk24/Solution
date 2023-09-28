package package2;

public class Prblm1672 {
//	Link - > https://leetcode.com/problems/richest-customer-wealth/description/
//	Richest customer wealth
	 public static int getMax(int []ar){
	        if(ar.length<=0){
	            return 0;
	        }
	        int max=ar[0];
	        for(int i : ar){
	            if(i>max){
	                max=i;
	            }
	        }
	        return max;
	    }
	    public int maximumWealth(int[][] accounts) {
	        
	        int customersTotalAmount[]= new int[accounts.length];
	        int i=0;
	        for(int[] arr:accounts){
	            int sum=0;
	            for(int j:arr){
	                sum+=j;
	            }
	            customersTotalAmount[i]=sum;
	            i++;
	        }
	        return getMax(customersTotalAmount);

	    }

}
