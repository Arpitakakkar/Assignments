package First.com;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number to check
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}
