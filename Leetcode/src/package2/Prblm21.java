package package2;

public class Prblm21 {
//	https://leetcode.com/problems/merge-two-sorted-lists/
//	merge two sorted linked list

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if(list1==null) return list2;
       if(list2==null) return list1;
       if(list1.val> list2.val){
           //swap
           var temp = list1;
           list1=list2;
           list2=temp;
       }
 var result = list1;
       while(list1!=null && list2!=null){

           ListNode tmp = null;
          while(list1!=null&&list1.val<=list2.val){
              tmp=list1;
              list1=list1.next;
          }// iterate until the list1 it finds the list 2 next value greater
            tmp.next = list2;
            var t = list2;
            list2=list1;
            list1=t;
       }
       return result;
    }