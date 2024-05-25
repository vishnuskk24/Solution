package package2;

import java.util.Stack;

public class Prblm71 {
	public String simplifyPath(String path) {
        String result  = new String();

        Stack<String> stack =  new Stack();
        String[] arr = path.split("/");

        for(String s : arr){
            if(s.toString().equals("..") && !stack.isEmpty())  stack.pop();
            else if(!s.equals("") && !s.equals(".") && !s.equals("..")) stack.push(s);
        
        }

        if(stack.isEmpty()) return "/";

        while(!stack.isEmpty()){
            if(result.equals("")) result = "/"+stack.pop();
            else result ="/"+stack.pop()+result;
        }
        return result;
    }
}
