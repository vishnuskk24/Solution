package patterns;

import java.util.Scanner;

public class Pattern8 {

	
	
	public static void pattern(int n) {
		
		
		
		for(int i =0 ; i<n+1;i++) {
			
			for(int j=0;j<1+i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<n*2-1-i*2;k++) {
				System.out.print("*");
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


//input     - > 5


//output   
//		*********
//		 *******
//		  *****
//		   ***
//		    *