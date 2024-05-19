package package2;

public class Prblm344 {

	 public void reverseString(char[] s) {
	        
	        for(int i=0;i<s.length;i++){
	            if(i>s.length/2 -1){
	                break;
	            }
	            char c = s[i];
	            s[i] = s[s.length-1-i];
	            s[s.length-1-i] =c;
	        }
	    }
}
