package package2;

import java.util.Arrays;

public class Prblm1051 {
	public int heightChecker(int[] heights) {
        int []temp = new int[heights.length];
        for(int i =0 ; i < heights.length;i++){
            temp[i]   = heights[i];
        }
        Arrays.sort(temp);
        int count = 0 ; 
        for(int i =0 ; i < heights.length;i++){
            if(temp[i] !=heights[i]){
                count++;
            }
        }
        return count;
        
    }
}
