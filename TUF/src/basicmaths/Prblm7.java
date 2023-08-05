package basicmaths;

public class Prblm7 {

	public static boolean checkPrime(int n) {
		if(n==1 || n==2) {
			return true;
		}
		
		for(int i =2 ; i<n;i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println(checkPrime(5));
	}
}
