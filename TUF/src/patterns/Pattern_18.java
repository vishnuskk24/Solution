package patterns;

import java.util.Scanner;

public class Pattern_18 {

	public static void pattern(int n) {
		
		
//		System.out.println(ch);
		
		for(int i=0;i<n ;i++) {
			char ch =(char) ('A'+n-1-i);
			
			for(int j=0;j<=i;j++) {
				System.out.print(ch++ + " ");
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		pattern(n);
		
	}
}


//	input  -> 5
	
//	output

//			E 
//			D E 
//			C D E 
//			B C D E 
//			A B C D E 
