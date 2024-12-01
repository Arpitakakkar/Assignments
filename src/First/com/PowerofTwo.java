package First.com;

import java.util.Scanner;

public class PowerofTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Input validation: Ensure N is between 0 and 30
        do {
            System.out.print("Enter a value for N (0 <= N < 31): ");
            while (!scanner.hasNextInt()) {
                System.out.print("That's not a valid number. Enter again: ");
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N < 0 || N >= 31);

        // Print the table of powers of 2
        System.out.println("Table of powers of 2:");
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
        }
    }
}

