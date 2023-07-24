package patterns;

import java.util.Scanner;

public class Pattern7 {

	
	public static void pattern(int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++) {
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


// input 5

// output

//    *
//   ***
//  *****
// *******
//*********