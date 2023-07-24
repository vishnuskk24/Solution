package patterns;

import java.util.Scanner;

public class Pattern6 {

	
	private static void pattern(int n) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=n;i++) {
//			System.out.println(" inside for 1");
			for(int j=1;j<=n-i+1;j++) {
//				System.out.println("inside for 2");
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		System.out.println("=>");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
	}

	
}


//input    5
	
//Output
//		12345
//		1234
//		123
//		12
//		1