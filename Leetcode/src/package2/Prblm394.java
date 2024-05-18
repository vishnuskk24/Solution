package package2;

import java.util.Stack;

public class Prblm394 {

}

class Solution {
    public String decodeString(String s) {
        Stack<Character> characters = new Stack();
        String result1 =  new String();
        char[] chars = s.toCharArray();
        for(Character c: chars ){
            characters.push(c);

        }

        while(!characters.isEmpty()){

                String temp = new String();
            Character c = characters.pop();
            if(c.equals(']')){
                continue;
            }
            else if(c>=65 && c<=90){
                temp = c+temp;
            }else {
                String range = new String();
                if(c.equals('[')){
                    while(!characters.isEmpty() ){
                        Character n = characters.pop();
                        if(!n.equals(']')){
                            range =n+range;
                        }else{
                            break;
                        }
                    }
                    Integer ranges = Integer.parseInt(range);
                    for(int i=0;i<ranges;i++){
                        result1 = temp+result1;
                    }
                    temp = "";
                }
            }

            }

        
        return result1;
        
    }
}