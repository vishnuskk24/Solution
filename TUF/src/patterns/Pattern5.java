package patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void patern(int n) {
	
		for(int i=1;i<=n;i++) {
			for(int j =i ; j<=n ; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		patern(sc.nextInt());
	}
}


//input  -	5

//output
//	*****
//	****
//	***
//	**
//	*