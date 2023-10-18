package package2;

public class Prblm21 {
//	https://leetcode.com/problems/merge-two-sorted-lists/
//	merge two sorted linked list
	var current=list2;
    var editPointer=list1;
    while(current!=null){
        while(editPointer!=null && editPointer.next!=null){
            if(current.val<=editPointer.next.val && current.val>editPointer.val){
                editPointer.next   = new ListNode(current.val,editPointer.next );   //adding  current value in middle

            }

            editPointer=editPointer.next;
        }
        ListNode n = new ListNode(current.val);
        editPointer=n;
        editPointer=editPointer.next;

        current=current.next;
    }


    
    return list1;
}
