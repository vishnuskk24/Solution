package patterns;

import java.util.Scanner;

public class Pattern_16 {

	public static void pattern(int n) {
		char l='A';
		for(int i=0;i<n ;i++,l++) {
			for(int j=0;j<=i;j++) {
				System.out.print(l);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		pattern(n);
	}
}


//input   5

//output  

//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
