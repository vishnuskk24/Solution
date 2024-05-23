package package2;

public class Prblm83 {

	public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode adPointer = head.next;
        while(current!=null && adPointer!=null){
            if(current.val!=adPointer.val){
                current.next=adPointer;
                current= adPointer;
                
            }
            adPointer=adPointer.next;
           
        }
        if(current!=null && current.next!=null)current.next=null;
        return head;
    }
}
