package package3;

public class Prblm54 {

	class Solution {
	    public List<Integer> spiralOrder(int[][] matrix) {
	        
	        int top= 0;
	        int left =  0;
	        int down =matrix.length-1;
	        int right = matrix[0].length-1;
	        List<Integer> arr = new ArrayList();
	        while(top<=down && left<=right){
	            // move right
	            for(int i=left;i<=right;i++){
	                arr.add(matrix[top][i]);
	            }
	            top++;
	            //  move down
	            for(int i=top;i<=down;i++){
	                arr.add(matrix[i][right]);

	            }
	            right--;
	            // move left
	            for(int i=right;top<=down&&i>=left;i--){
	                arr.add(matrix[down][i]);
	            }
	            down--;
	           
	            for(int i=down;left<=right&& i>=top;i--){
	            System.out.println("Executing "+ matrix[i][top]);    
	                    arr.add(matrix[i][left]);
	            }
	            left++;
	        }

	        System.out.println(top + " "+left +" "+ right+" "+ down);
	        return arr;
	    }
	}
}
