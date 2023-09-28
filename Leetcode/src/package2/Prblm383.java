package package2;

public class Prblm383 {
//	Link   -> https://leetcode.com/problems/ransom-note/description/
//	ransome Note
	 public static boolean contains(char[] arr , char a){
	        boolean flag=false;
	        for(int i=0;i<arr.length;i++){

	            if(arr[i]=='-'){
	                continue;
	            }
	            else if(arr[i]==a){
	                flag=true;
	                arr[i] = '-';
	                break;
	            }
	        }
	        return flag;
	    }
	    public boolean canConstruct(String ransomNote, String magazine) {
	        
	        char[] ran = ransomNote.toCharArray();
	        char[] mag =  magazine.toCharArray();

	        boolean flag = true;


	        for(int i =0 ; i < ran.length;i++){
	            if(!contains(mag,ran[i])){
	                flag=false;
	                break;
	            }
	        }

	   
	        return flag;
	    }

}
