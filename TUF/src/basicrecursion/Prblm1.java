package basicrecursion;

public class Prblm1 {

	
	 static int count = 0;
	    static void fun(){
	        
	         // Base Condition.
	         if(count == 3 ) return;
	         System.out.println(count);

	         // Count incremented.
	         count = count+1;
	         fun();

	    }
	    public static void main(String[] args) {
	        fun();
	    }
}
