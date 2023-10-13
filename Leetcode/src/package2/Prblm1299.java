package package2;

public class Prblm1299 {
//	https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/

//Replace Elements with Greatest Element on Right Side
	
static int getGreatest(int []arr , int pointer){
        
        int greatest = -1;
        for(int i=pointer;i<arr.length;i++){// if it went  to end of the array then the  greatest is -1
            if(arr[i]>greatest){
                greatest=arr[i];
                
            }
        }
        return greatest;
        
    }
    public int[] replaceElements(int[] arr) {
        
        
        
        for(int i=0; i<arr.length;i++){
           arr[i]=getGreatest(arr,i+1);
        }
        return arr;
    }
}
