package package2;

public class Prblm19 {
//	remove nth node from the end of linked list
//	https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
	public ListNode removeNthFromEnd(ListNode head, int n) {
	        int i=1;
	        int length=0;
	        
	      var current = head;
	        while(current!=null){ // calculating length
	           current=current.next;
	           length++;
	        }
	        if(length==1 && n==1){
	            return null;

	        }
	        current=head;
	        int expect =length-n;
	            System.out.println(expect + " expect");
	        if(expect==0){
	            head=head.next;
	            return head;
	        }
	        while(current!=null){
	            if(i==expect){
	                if(current.next.next==null){ // before last previous node
	                  System.out.println("inside block");
	                    current.next=null;
	                    break;
	                }
	                System.out.println("outside block");
	                current.next=current.next.next;
	                break;

	            }
	            current=current.next;
	            i++;
	        }

	        return head;
	    
}
