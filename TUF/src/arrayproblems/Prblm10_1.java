package arrayproblems;

import java.util.ArrayList;
import java.util.List;

public class Prblm10_1 {
	 public static List< Integer > sortedArray(int []a, int []b) {
	        // Uion of Two sorted array

	        List<Integer> result = new ArrayList<>();
	        int size2=b.length;
	        int size1=a.length;
	        int i=0;
	        int j=0;
	        while(i<size1 && j<size2){
	                // System.out.println("inside first while");
	            if(a[i]<=b[j]){
	                // choosing element in first element we need to check in array
	                if(result.size()==0 || result.get(result.size()-1)!=a[i]){
	                    result.add(a[i]);
	                   
	                }
	                 i++;
	            }    
	            else{
	                    // take the  element in the second array becoz second array current element is lesser
	                    // before adding we need to check wheather the element is already present in the result
	                if(result.size()==0||result.get(result.size()-1)!=b[j]){
	                    result.add(b[j]);
	                   
	                }
	                 j++;
	            }

	            
//	          these above while loop will work until we reach end at one of the array
	        }
	        while(i<size1){
	            //  System.out.println("inside second while");
	            if(result.size()==0 || result.get(result.size()-1)!=a[i]){
	                result.add(a[i]);
	              
	            }
	              i++;

	        }
	        while(j<size2){
	            //  System.out.println("inside third while");
	             if(result.size()==0 || result.get(result.size()-1)!=b[j]){
	                result.add(b[j]);
	                
	            }
	            j++;
	        }
	        return result;
	    }

}
