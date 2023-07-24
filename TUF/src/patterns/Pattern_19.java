package patterns;

import java.util.Scanner;

public class Pattern_19 {

	
	public static void pattern(int n) {
		
		for(int i=0;i<n*2;i++) { // rows
			
			if(i<n) {
				for(int j=0;j<n-i;j++) {
					System.out.print("*");
				}
				for(int j=0;j<i*2;j++) {
					System.out.print(" ");
					
				}
				for(int j=0;j<n-i;j++) {
					System.out.print("*");
					
				}
				
			}else {
				int z= i%n;
				for(int j=0;j<=z;j++) {
					System.out.print("*");
				}
				for(int j=0;j<n*2-z*2-2;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<=z;j++) {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args)  { 
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		pattern(n);
	}
}



//input  - > 5

//output

//			**********
//			****  ****
//			***    ***
//			**      **
//			*        *
//			*        *
//			**      **
//			***    ***
//			****  ****
//			**********

