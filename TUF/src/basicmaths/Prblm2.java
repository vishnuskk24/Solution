package basicmaths;

public class Prblm2 {
// reverse a number
	public static int reverseNumber( int input) {
	
		int reverse =0
				;
		while(input!=0) {
			reverse*=10;
		
			reverse=(reverse + input%10 );
			input=input/10;
			
		}
		return reverse;
	}
	public static void main(String [] args) {
		System.out.println(reverseNumber(12345));
	}
}
