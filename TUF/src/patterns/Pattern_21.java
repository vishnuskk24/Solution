package patterns;

import java.util.Scanner;

public class Pattern_21 {

	public static void pattern(int n) {
		
		for(int i=0;i<n;i++) {
			
				for(int j=0;j<n;j++) {
//					System.out.println("for i");
					if(i==0 || i==n-1 || j==0 || j==n-1 ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
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

//input  - > 5


// 	output

//		*****
//		*   *
//		*   *
//		*   *
//		*****

