package patterns;

import java.util.Scanner;

public class Pattern1 {
	
	public static void Pattern(int n) {
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=>");
		int count = sc.nextInt();
		Pattern(count);
		
	}
}

//input 6

//******
//******
//******
//******
//******
//******
