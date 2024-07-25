package package3;

import java.util.Stack;

public class Prblm394 {
	class Solution {
	    public String decodeString(String s) {

	     
	        int count =0;
	        String res="";
	        Stack<Integer> counts =  new Stack();
	        Stack<String>  resut = new Stack();

	        int index = 0 ;  // pointer


	        while(index<s.length()){
	            // System.out.println("inside while    res - > " +  res +  "  index  " +  index);
	            if(Character.isDigit(s.charAt(index))){
	                // System.out.println("if");
	                count =0;
	                // System.out.println(Character.isDigit(s.charAt(index)));
	                while(Character.isDigit(s.charAt(index))){
	                    // System.out.println("line 19 " +  index);
	                    count = 10*count+ (int)s.charAt(index)-'0';
	                    index++;
	                }

	                counts.push(count);  // once the curent pointer becomes other than integer then add it to stack
	            }
	            else if(s.charAt(index)=='['){
	                // System.out.println("else if 1   adding " +  res + " to stack ");
	                

	                resut.push(res);
	                // System.out.println(resut);
	                res="";
	                index++;

	            }else if(s.charAt(index)==']'){
	                // System.out.println("else if 2  evaluate");
	                // if it is closing barcket evaluate
	                String temp = resut.pop();
	                int c =counts.pop();
	                // System.out.println("pop the val  c - > " + c + "   temp - > " + temp + "  res - > " + res );
	                for(int i=0;i<c;i++){
	                //    System.out.println("for ") ;
	                 temp=temp+res;

	                } 
	                res=temp;
	                // System.out.println("After evaluating  res - > " + res);
	                index++;

	            }   else{
	                // System.out.println("else");
	                    res+=s.charAt(index);
	                    index++;
	            }

	        }
	        return res;
	    }
	}

}
