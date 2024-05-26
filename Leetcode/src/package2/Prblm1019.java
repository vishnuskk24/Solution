package package2;

public class Prblm1019 {

	public int[] nextLargerNodes(ListNode head) {
	       ListNode current = head;
	        int size=0;
	       while(current!=null){
	            size++;

	            current=current.next;
	       }

	       int[] result = new int[size] ;
	        current=head;
	        int index=0;
	       while(current!=null){
	            ListNode current2 = current.next;
	            boolean flag = true;
	            while(current2!=null){
	                if(current.val<current2.val){
	                    result[index] = current2.val;
	                    index++;
	                    flag = false;
	                    break;
	                }
	                current2=current2.next;
	            }
	            if(flag){
	                result[index]=0;
	                index++;
	            }

	           current= current.next;
	       }
	       return result;

	    }   
}
