package package2;

import java.util.Stack;

public class Prblm1047_1 {


    String result = new String();
    Stack<Character> st =  new Stack();

    for(Character c : s.toCharArray()){

        st.push(c);
    }

    
    while(!st.isEmpty()){
        // Character c = st.pop(); 
        if(!st.isEmpty()  && !result.equals("")&& st.peek().equals(result.charAt(0))){
            st.pop();
            result = result.substring(1,result.length());
            continue;
        }
        result = st.pop()+result;
    }
    return result;
    
}
}
