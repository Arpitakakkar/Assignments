package First.com;


import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Input validation: Ensure N > 1
        do {
            System.out.print("Enter a positive integer greater than 1: ");
            while (!scanner.hasNextInt()) {
                System.out.print("That's not a valid number. Enter again: ");
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N <= 1);

        // Compute prime factors
        System.out.print("The prime factors of " + N + " are: ");
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }
        // If N is a prime number greater than 1, print it
        if (N > 1) {
            System.out.print(N);
        }
        System.out.println();
    }
}

