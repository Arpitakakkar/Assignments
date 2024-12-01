package First.com;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Input validation: Ensure N > 0
        do {
            System.out.print("Enter a positive integer value for N: ");
            while (!scanner.hasNextInt()) {
                System.out.print("That's not a valid number. Enter again: ");
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N <= 0);

        // Calculate the Nth harmonic number
        double harmonicValue = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonicValue += 1.0 / i;
        }

        // Output the result
        System.out.printf("The %dth Harmonic Value is: %.6f%n", N, harmonicValue);
    }
}

