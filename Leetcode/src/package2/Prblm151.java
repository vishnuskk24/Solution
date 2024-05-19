package package2;

public class Prblm151 {

	
	 public String reverseWords(String s) {
	        

	        String result = "";

	        for(String ss: s.split(" ")){

	            if(ss.equals(" ")|| ss.equals("")){
	                continue;
	            }
	            ss=ss.trim();
	            
	            result = ss+" "+result;
	        }
	        return result.trim();
	    }
}
