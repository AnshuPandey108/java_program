import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n, count = 0;
        System.out.println("Enter any number:");
        
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        // Check for numbers less than 2
        if (n < 2) {
            System.out.println("Not Prime");
        } else {
            // Count the number of divisors
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            // A prime number has exactly 2 divisors: 1 and itself
            if (count == 2) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Not Prime");
            }
        }
        
        scanner.close();
    }
}
