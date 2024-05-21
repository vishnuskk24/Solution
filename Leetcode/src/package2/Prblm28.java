package package2;

public class Prblm28 {

	public int strStr(String haystack, String needle) {
        // if(haystack.equals(needle)){return 0;}
       
        int length =  needle.length();
        // if(length==1) return haystack.indexOf(needle);

        int pointer1=0;
        int pointer2 = pointer1 +length;

        for(;pointer2<=haystack.length();){
          if(haystack.substring(pointer1,pointer2).equals(needle)){
                return pointer1;
            }
            pointer1++;
            pointer2++;
        }
        return -1;
    }
}
