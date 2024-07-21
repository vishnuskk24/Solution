package package3;

public class Prblm32 {
//	https://leetcode.com/problems/longest-valid-parentheses/
	
	 public int longestValidParentheses(String s) {
	        

	        int left =0;
	        int right =0;

	        int retmax =0;
	        int max=0;

	        int index =0;
	        for(Character c : s.toCharArray()){

	            if(c=='('){
	                left++;
	            }else{
	               
	                right++;
	                
	            }
	            if(left==right){
	                max=left*2;

	                if(retmax<max) retmax=max;
	            }
	            else if(right>left){
	                left=0;
	                right=0;
	            }
	           
	            index++;
	        }

	    left =0;
	    right=0;
	    max=0;
	        for( index = s.length()-1;index>=0;index--){
	            
	               
	            if(s.charAt(index)=='('){
	                left++;
	            }else{
	                right++;
	            }
	            if(left==right){
	               
	                  max=left*2;
	                 if(retmax<max){
	                    retmax=max;
	                   
	                 } 
	            }
	            else if(right<left){
	                left=0;
	                right=0;
	            }
	        }

	       
	        return retmax;
	    }
}
