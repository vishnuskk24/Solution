package package2;

import java.util.Stack;

public class Prblm234 {
	 Stack<Integer> st =  new Stack();

	    public boolean isPalindrome(ListNode head) {
	        ListNode current = head;
	        while(current!=null){
	            st.push(current.val);
	             current = current.next;
	        }    
	        current = head;
	        while(current!=null){
	            if(current.val!=st.pop()) return false;
	            current = current.next;
	        }
	        return true;
	    }

}
