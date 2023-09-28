package package2;

import java.util.ArrayList;
import java.util.List;

public class Prblm412 {

//	link  -> https://leetcode.com/problems/fizz-buzz/description/
//	fizz-buzz
	public List<String> fizzBuzz(int n) {
        
        List<String> result=new ArrayList<>();
        for(int i=1;i<=n;i++){

            if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            }
            else if(i%3==0){
                result.add("Fizz");
            }
             else if(i%5==0){
                result.add("Buzz");
            }
            else{
                result.add(i+"");
            }
        }
        return result;
    }
}
