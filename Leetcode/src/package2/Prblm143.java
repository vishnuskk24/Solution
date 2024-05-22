package package2;

import java.util.ArrayList;
import java.util.List;

public class Prblm143 {

	
	public void reorderList(ListNode head) {
        if(head==null || head.next==null){
        return;
        }
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while(current!=null){
            values.add(current.val);
            current =  current.next;
        }

        int pointer1 = 0;
        int pointer2=values.size()-1;
        ListNode result = null;
        ListNode curent=null;
        while(pointer1<pointer2){
          ListNode  first= new ListNode(values.get(pointer1));
           ListNode   second= new ListNode(values.get(pointer2));
           
            first.next=second;
          
             if(result==null) {
                result = first;
             }else{
                current.next =first;
             }
               current =second;
            pointer1++;
            pointer2--;
        }
        if(pointer1==pointer2){
            current.next = new ListNode(values.get(pointer1));
        }
        ListNode i = result;
        ListNode j= head;
        while(i!=null && j!=null){
           
            j.val=i.val;
            i=i.next;
            j=j.next;
        }
        
    }
}
