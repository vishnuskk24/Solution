package patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void pattern(int n) {
		
		for(int i=0;i<n*2;i++) {
			
			if(i<=(n*2)/2) {
				
				for(int j=0 ;j<i;j++) {
					
					System.out.print("*");
//					System.out.print("if");
				}
			}
			else {
				for(int j = 0;j<n-(i%n);j++) {
//					System.out.println("else");
					System.out.print("*");
					
				}//System.out.print("else");
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

//input 
//   5

//	 output
//	*
//	**
//	***
//	****
//	*****
//	****
//	***
//	**
//	*
