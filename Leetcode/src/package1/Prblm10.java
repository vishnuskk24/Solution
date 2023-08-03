package package1;

public class Prblm10 {
	
//	valid palindrome
	
	  public static boolean between(int start ,int end, int value){
	        return value<=end &&value>=start;
	    }
	    public static boolean isPalindromeI(char[] ch,int i,int pointertwo){
	        if(i>=ch.length/2){
	            return true;
	        }
	        if(ch[i]!=ch[pointertwo]) return false;
	        return isPalindromeI(ch,i+1,pointertwo-1);
	    }
	    public boolean isPalindrome(String s) {
	        //33-47  58-64 91-96 123 -126
	        String input = new String();
	        for(char c : s.toCharArray()){
	            if(c==' '|| between(33,47,c)|| between(58,64,c) || between(91,96,c) || between(123,126,c)){
	                continue;
	            }
	            input+=c;
	            
	        }
	        System.out.println(input);

	    return isPalindromeI(input.toLowerCase().toCharArray(),0,input.toCharArray().length-1);
	    }

}
