package package2;

import java.util.Stack;

public class Prblm682 {

//	https://leetcode.com/problems/baseball-game/
	int sum=0;

    Stack<String> stack =  new Stack();
    
    for(String s :operations){
        if(s.matches("-?\\d+"))    {
            stack.push(s);
        }else if(s.equals("C")){
            if(!stack.isEmpty()){
                stack.pop();
            }
        }else if(s.equals("D")){
            if(!stack.isEmpty()){
                  stack.push((2*Integer.parseInt(stack.peek()))+"");
               
                
            }
        }else{
           
            if(!stack.isEmpty()){
                String last = stack.pop();
                String secondLast = stack.pop();
                stack.push(secondLast);
                stack.push(last);

                stack.push(Integer.parseInt(last)+Integer.parseInt(secondLast)+"");
            }
           
        }
    
   
    }
    while(!stack.isEmpty()){
                    sum+=Integer.parseInt(stack.pop());
    }
    return sum;
    
}
}
