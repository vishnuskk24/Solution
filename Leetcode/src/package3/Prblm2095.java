package package3;

public class Prblm2095 {

	

//	  Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
	class Solution {
	    public ListNode deleteMiddle(ListNode head) {
	        
	        if(head.next==null) return null;
	        ListNode slow = head;
	        ListNode fast = head;
	        ListNode prev=head;
	        ListNode next = head.next;

	        while(fast!=null && fast.next!=null){
	            
	            prev =slow;
	            

	            slow = slow.next;
	            fast = fast.next.next;
	            next = slow.next; 

	        }
	        prev.next=next;
	        // System.gc();
	        return head;


	    }
	}
}
