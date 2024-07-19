import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        
        // Read the range from the user
        System.out.println("Enter 1st Number: ");
        int n1 = r.nextInt();
        System.out.println("Enter 2nd Number: ");
        int n2 = r.nextInt();
        
        // Find and print prime numbers in the range
        for (int i = n1; i <= n2; i++) {
            if (i < 2) {
                continue; // Skip numbers less than 2 as they are not prime
            }
            
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) { // Optimized loop
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println("Prime Number is: " + i);
            }
        }
        
        r.close();
    }
}
