package First.com;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Two numbers (dividend and divisor)
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Compute quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Output: Display quotient and remainder
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}

