package patterns;

import java.util.Scanner;

public class Pattern_15 {

	
	public static void pattern(int n) {
		
		for(int i=0;i<n;i++) {
			for(char j = 'A';j<'A'+n-i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		pattern(n);
		
		
	}
}

//input   -> 5

//output
		
//			A B C D E 
//			A B C D 
//			A B C 
//			A B 
//			A 
