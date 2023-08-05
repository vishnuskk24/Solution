package basicmaths;

public class Prblm4 {

	
	// GCD
	public static int getMin(int n1, int n2) {
		return n1>n2?n2:n1;
	}
//	public static int getGCD(int n1,int n2) {
//		int gcd =1;
//		int low=getMin(n1, n2);
//		for(int i=low; low>0;low--) {
//			if(n1%low==0 && n2%low==0) {
//				gcd=low;
//				break;
//			}
//		}
//		
//		return gcd;
//	}
	
	public static int getGCD(int n1,int n2) {
		if(n2==0) {
			return n1;
		}
		return getGCD(n2, n1%n2);
	}
	
	public static void main(String[] args) {
		System.out.println(getGCD(6,3));
	}
}

