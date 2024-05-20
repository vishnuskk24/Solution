package package2;

public class Prblm2 {
//	https://leetcode.com/problems/add-two-numbers/description/

	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        int size1 = 0;
	         int size2 = 0;
	        ListNode l3 =l1;
	        while(l3!=null){
	            size1++;
	            l3 = l3.next;
	        }
	        ListNode l4 =l2;
	        while(l4!=null){
	            size2++;
	            l4 = l4.next;
	        }
	        
	        int maxSize = (size1>size2)?size1:size2;
	      
	        if(maxSize==0){
	            ListNode result = new ListNode(0);
	            return result;
	        }
	        int[] arr1 =  new int[maxSize+1];
	        int[] arr2 =  new int[maxSize+1];
	        int[] arr3 =  new int[maxSize+1];

	        l3 = l1;
	        int i=0;
	        while(l3!=null){
	            arr1[i]=l3.val;
	            i++;
	            l3= l3.next;
	        }
	        l4 = l2;
	         i=0;
	        while(l4!=null){
	            arr2[i]=l4.val;
	            i++;
	            l4= l4.next;
	        }
	        int rem=0;
	       
	        for(int j = 0;j<maxSize+1;j++){
	            int sum = arr1[j] + arr2[j];
	            sum+=rem;
	            int val=sum;
	            rem=0;
	            if(sum>=10){
	                val = val%10;
	                while(sum>=10){
	                    rem++;
	                    sum=sum/10;
	                }

	            }
	                arr3[j] =val;
	       
	        }
	        if(rem>0) arr3[maxSize]=rem;
	        
	            ListNode result = null ;
	            ListNode current =null;
	        for(int j=0;j<maxSize+1;j++){
	            if(j==maxSize && arr3[j]==0) break;
	            if(result ==null){
	                result = new ListNode(arr3[j]);
	                current=result;
	            }else{
	                current.next = new ListNode(arr3[j]);
	                current=current.next;
	            }
	        }
	        return result;
	        

	    }
}
