package basicrecursion;

public class Prblm2 {

	 static void func(int i, int n){
	        
         // Base Condition.
         if(i>n) return;
         System.out.println(i);

         // Function call to print i till i increments to n.
         func(i+1,n);

 }
 public static void main(String[] args) {

    // Here, let�s take the value of n to be 4.
    int n = 4;
    func(1,n);
 }

}
