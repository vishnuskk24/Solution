package basicmaths;

public class Prblm3 {
	
	
	public static Integer reverse(Integer i) {
		
		int reverse =0;
		
		while(i!=0) {
			reverse*=10;
			reverse+=i%10;
			i=i/10;
			
		}
		return reverse;
	}
	public static boolean checkPalindrome(Integer input) {
		
		return reverse(input).equals(input)?true:false;
	}

	public static void main(String[] args) {
	
		System.out.println(checkPalindrome(123));
	}
}
