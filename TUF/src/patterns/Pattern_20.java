package patterns;

import java.util.Scanner;

public class Pattern_20 {

	
	public static void pattern(int n) {
		
		for(int i=0;i<n*2;i++) {
			
			if(i<n) {
				
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				for(int j=0;j<n*2-i*2-2;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
			}else {
				int z=i%n+1;
				for(int j=0;j<n-z;j++) {
					System.out.print("*");
				}
				
				for(int j =0 ; j<z*2;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<n-z;j++) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		pattern(n);
	}
}

// input  5



//output


//			*        *
//			**      **
//			***    ***
//			****  ****
//			**********
//			****  ****
//			***    ***
//			**      **
//			*        *
          


