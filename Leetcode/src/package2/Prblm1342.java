package package2;

public class Prblm1342 {
//Link- > https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
//	number of steps to reduce the nimber to zero
	
	 public int numberOfSteps(int num) {
	        int step=0;

	    while(num>0){
	        if(num%2==0){
	            num/=2;
	        }else{
	            num--;
	        }
	        step++;
	    }
	        return step;
	    }
}
