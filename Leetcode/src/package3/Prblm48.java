package package3;

public class Prblm48 {

	class Solution {
	    public void rotate(int[][] matrix) {
	        
	        int n = matrix.length;
	        // int[][] arr = new int[n][n];

	        // for(int i=0;i<matrix.length;i++){

	        //     for(int j=0 ; j<matrix.length;j++){

	        //         arr[j][n-i-1] = matrix[i][j];
	        //     }

	        // }
	        // for(int i=0;i<n;i++){
	        //     for(int j=0;j<n;j++){
	            
	        //         matrix[i][j]= arr[i][j];

	        //     }

	        // }


	        for(int i=0;i<n;i++){
	            for(int j=i;j<n;j++){

	                int temp = matrix[j][i];
	                matrix[j][i] = matrix[i][j];
	                matrix[i][j]= temp;
	                //  System.out.println( i +" "+ j+"["+matrix[i][j]  + "] -> "+ j + " "+ i + "["+matrix[j][i]+"]  }}" + temp);
	            }
	        }

	        // for(int i=0;i<n;i++){
	            
	        //     for(int j=0;j<n;j++){
	        //         System.out.print(matrix[i][j]);
	        //     }
	        // // System.out.println();
	        // }
	        for(int i=0;i<n;i++){{
	            int j=0;
	            while(j<n/2){

	                int temp = matrix[i][j];
	                matrix[i][j]=matrix[i][n-j-1] ;
	                matrix[i][n-j-1]=temp;
	                j++;

	            }
	        }

	        }
	    }
	}
}
