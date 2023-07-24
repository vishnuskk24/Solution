package patterns;

import java.util.Scanner;

public class Pattern_12 {

	
	public static void pattern(int n) {
				
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1 ;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=1;j<n*2+1 -i*2;j++) {
				System.out.print(" ");
			}
			for(int k = i;k>0;k--) {
				System.out.print(k);
				
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		pattern(n);
	}
}


//input  

//	6
//output
//	
//	1          1
//	12        21
//	123      321
//	1234    4321
//	12345  54321
//	123456654321
