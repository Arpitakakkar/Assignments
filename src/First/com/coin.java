package First.com;
import java.util.*;
public class coin {
    public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
                int flips;

                do {
                    System.out.print("Enter the number of times to flip the coin (positive integer): ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("That's not a valid number. Enter again: ");
                        scanner.next();
                    }
                    flips = scanner.nextInt();
                } while (flips <= 0);

                int heads = 0, tails = 0;

                for (int i = 0; i < flips; i++) {
                    if (Math.random() < 0.5) {
                        tails++;
                    } else {
                        heads++;
                    }
                }

                double headPercentage = (double) heads / flips * 100;
                double tailPercentage = (double) tails / flips * 100;

                System.out.printf("Heads: %d (%.2f%%)%n", heads, headPercentage);
                System.out.printf("Tails: %d (%.2f%%)%n", tails, tailPercentage);
            }
        }
