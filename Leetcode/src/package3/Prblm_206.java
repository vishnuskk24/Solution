package package3;

public class Prblm_206 {

	
//	   Definition for singly-linked list.
	   public class ListNode {
	       int val;
	       ListNode next;
	       ListNode() {}
	       ListNode(int val) { this.val = val; }
	       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	   }
	
	class Solution {
	    public ListNode reverseList(ListNode head) {

	        ListNode previous = null;
	        while(head!=null){

	            ListNode nextNodeBackup = head.next; // this node will have remaining nodes in the sequence  we need to take it as backup as we are playing with head

	            head.next=previous;  // changing the Direction
	            previous = head;// for next iteration we are need access of head

	            head=nextNodeBackup;
	        }
	        
	        return previous;      // head becomes null  previous is previous starting point
	    }
	}
}
