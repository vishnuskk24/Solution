package patterns;

import java.util.Scanner;

public class Pattern6 {

	
	private static void pattern(int n) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=n;i++) {
			for(int j=i;i<=n;j++) {
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
