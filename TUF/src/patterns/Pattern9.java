package patterns;

import java.util.Scanner;

public class Pattern9 {

	
	public static void pattern(int n) {
		
		for(int i=0;i<n;i++) {
//			System.out.println("ppppp");
			
			for(int j=0;j<n-i;j++) {
				
				System.out.print(" ");
			}
			
			for(int k=0;k<i*2+1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0;i<n;i++) {
			
			for(int k =0;k<i+1;k++) {
				System.out.print(" ");
				
			}
			for(int j =0;j<n*2-i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner s   = new Scanner(System.in);
		int n = s.nextInt();
		pattern(n);
	}
}



// input 

//5
//  output
//			    *
//			   ***
//			  *****
//			 *******
//			*********
//			*********
//			 *******
//			  *****
//			   ***
//			    *



