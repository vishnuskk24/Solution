package package3;

import java.util.Stack;

public class Prblm856 {

public int scoreOfParentheses(String s) {
        

        int score =0;
        Stack<Integer> st = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c=='('){
                st.push(score);
                score=0;

            }else{
                
                // calculate score
                                // decide whether it is nested or neighbour
                score = st.pop()+Math.max(score*2,1);
            }
        }
        return score;
    }
}
