package package2;

import java.util.Stack;

public class Prblm20 {

public boolean isValid(String s) {
        

        Stack<Character> symbols =  new Stack();
      
        for(Character c : s.toCharArray()){
           if(c=='{' || c=='[' || c=='('){  // if opening
                symbols.push(c);
           }else{
            // closing tag
            if(symbols.isEmpty()) return false;
           
            if(!symbols.isEmpty() && (symbols.peek() =='{' && c=='}' ) || (symbols.peek() =='(' && c==')' ) || (symbols.peek() =='[' && c==']' )){ 
                
                symbols.pop();
            }else{
                return false;
            }
           }
       
        }
        
        return symbols.isEmpty();
    }
}
