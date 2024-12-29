package sample;

import java.util.Scanner;

public class Sample {
	
	public boolean isPrime(int number) {
		
		if(number==1)return true;
		if(number==2 || number ==0)return false;
		
		
		
		for(int i=2;i<=Math.sqrt(number);i++ ) {
			if(number%i==0) return false;
		}
		return true;
		
	}
	public void manipulateArrayA(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			
			if(!isPrime(a[i])) {
				System.out.println(a[i]+" is not prime");
					a[i]=0;
			}
			
		}
		
	}
	
	
	public int calculateSum(int n, int[] a, int b[]) {
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i]*b[i];
			
		}
		return sum;
	}
	public void swap(int i, int j, int b[]) {
		
		int temp = b[i];
		b[i]=b[j];
		b[j]=temp;
		
	}
	public int findRange(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				return i;
			}
			
		}
	
		return 0;
	}
	
	public int doOperation(int n,int[] a, int[] b) {
		
		
		int max = 0;
		
		manipulateArrayA(a);
		
		System.out.println("updated A +++++");
		for(int i:a) {
			System.out.print(i+" ");
			
		}
//		 find the sum
		System.out.println("\n b  -> ");
		for(int i:a) {
			System.out.print(i+" ");
			
		}
		
		int sum = calculateSum(n,a,b);
		max=Math.max(max, sum);
		System.out.println("\ninitial sum "+ sum);
		
		
		int range = findRange(b);
		
		System.out.println("Range => "+range);
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				
				if(b[i]==b[j] || b[j]==0) continue;
				System.out.println("swaping " + i+" -- > "+ j);
				swap(i,j,b);
				sum = calculateSum(n,a,b);
				System.out.println(" the sum is -> "+ sum);
				if(max<=sum) {max=sum;break;}
//				max=Math.max(max, sum);
				swap(i,j,b);
				System.out.println("=================");
			
			}
			
				
			
		}
		
		
		return max;
		
	}
	public static void main(String[] args) {
		
		
		Scanner sc =  new Scanner(System.in);
		
		int n =  sc.nextInt();
		
		int a[] =  new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
			
		}
		
		Sample s =  new Sample();
		
		System.out.println(s.doOperation(n, a, b));
	}

}
