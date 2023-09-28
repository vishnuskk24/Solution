package package2;

public class Prblm876 {
	
//	Link -> https://leetcode.com/problems/middle-of-the-linked-list/description/
//	middle of linked list
	  public ListNode middleNode(ListNode head) {
	         
	         ListNode fast=head;
	         ListNode slow = head;
	         while(fast!=null && fast.next!=null){
	             fast=fast.next.next;
	             slow=slow.next;
	         }
	         return slow;
	    }
	  
//	  did two pointer approach  thank you MOSH  :)
}
