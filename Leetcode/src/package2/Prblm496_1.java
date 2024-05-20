package package2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Prblm496_1 {

	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	  Map<Integer ,Integer>   maps =  new HashMap<>();

      Stack<Integer> stack = new Stack();

      for(int num:nums2){
          while(!stack.isEmpty() && stack.peek()<num){ 
              maps.put(stack.pop(),num);
          }
          stack.push(num);
      }

      for(int i=0;i<nums1.length;i++){
          nums1[i] = maps.getOrDefault(nums1[i],-1);
      }
     return nums1;
     
  }
}
