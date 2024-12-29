package sample;import java.util.*;

public class Sample2 {

    // Check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true; // 2 is prime
        if (number % 2 == 0) return false; // Other even numbers are not prime
        
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Perform operations to maximize the score
    public int doOperation(int n, int[] a, int[] b) {
        List<Integer> primeValues = new ArrayList<>();
        List<Integer> positionsOfOnes = new ArrayList<>();

        // Find prime numbers and their positions
        for (int i = 0; i < n; i++) {
            if (isPrime(a[i])) {
                primeValues.add(a[i]);
            }
            if (b[i] == 1) {
                positionsOfOnes.add(i);
            }
        }

        // Sort prime values in descending order
        Collections.sort(primeValues, Collections.reverseOrder());

        // Create a new array to store modified values of a
        int[] modifiedA = new int[n];

        // Match prime numbers with positions of 1s
        for (int i : positionsOfOnes) {
            if (!primeValues.isEmpty()) {
                modifiedA[i] = primeValues.remove(0); 
            }
        }

        // Calculate the score
        int score = 0;
        for (int i = 0; i < n; i++) {
            score += modifiedA[i] * b[i];
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Sample2 s = new Sample2();
        System.out.println(s.doOperation(n, a, b));
    }
}