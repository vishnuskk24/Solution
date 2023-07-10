package patterns;

import java.util.Scanner;

public class Pattern3 {

	
	
	public static void Pattern(int count) {
		// TODO Auto-generated method stub
		for(int i=1;i<=count;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
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

//input  6 

//	output

//	1
//	12
//	123
//	1234
//	12345
//	123456
