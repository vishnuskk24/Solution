package patterns;

import java.util.Scanner;

public class Pattern_17 {

	public static void pattern(int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
				
			}
			char c = 'A';
			int mid = (i*2+1)/2;
			
			for(int j=1;j<=i*2+1;j++) {
				
				System.out.print(c);
				if(j<=mid) c++;
				else c--;
				
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
	}
}


//input  5
//output
//		    A
//		   ABA
//		  ABCBA
//		 ABCDCBA
//		ABCDEDCBA
