package package3;

import java.util.Stack;

public class Prblm32_1 {

//	https://leetcode.com/problems/longest-valid-parentheses/
	public int longestValidParentheses(String s) {
        
	    Stack<Integer> st =  new Stack();
	    int i=0;
	    int max = 0;
	    st.push(-1);
	    for(Character c : s.toCharArray()){
	        if(c=='('){
	            st.push(i);
	        }else{
	            st.pop();

	            if(st.isEmpty()){
	                st.push(i);
	            }

	            max = max>i-st.peek()?max:i-st.peek();
	        }

	        i++;
	    }
	       

	       return max;
	}
}
