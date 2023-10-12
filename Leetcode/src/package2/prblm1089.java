package package2;

//duplicate zeros
public class prblm1089 {

	
	
	

//  static void print(int[] num){
//      for(int n : num){
//          System.out.print(n +", ");
         
//      }
//       System.out.println();
//  }
static void moveRight(int num[],int pointer){
    
    for(int i=num.length-2;i>=pointer;i--){
        num[i+1]=num[i];
        
    }
   
}
 public void duplicateZeros(int[] arr) {
   
     for(int i=0;i<arr.length;i++){
      //   System.out.println(i + " " ); //print(arr);
         if(arr[i]==0 && i!=arr.length-1){
            // System.out.println("index " + i + " have zero so moving right from " + (i+1));
           // System.out.print("before"); print(arr);
             moveRight(arr,i+1);
             arr[i+1]=0;
           // System.out.print("after"); print(arr);
             
             i++;//i++;
         }
     }
   //  print(arr);
 }
	public static void main(String[] args) {
		
	}
}
