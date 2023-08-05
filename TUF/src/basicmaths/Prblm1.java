package basicmaths;

public class Prblm1 {
// count digits
	
	public static int countDigit(Integer input) {
		
		int count =0 ;
		
		while(input!=0) {
			
			input=input/10;
			count++;
		}
		return count;
		
	}
	public static void main(String[] args) {
		
		int input =12345;
		System.out.println(countDigit(input));
		
	}
}
