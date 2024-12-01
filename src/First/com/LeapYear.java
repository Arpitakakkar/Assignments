package First.com;
import java.util.*;
public class LeapYear {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int year;

            // Input validation: Ensure the year is a 4-digit number
            do {
                System.out.print("Enter a 4-digit year: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("That's not a valid number. Enter a 4-digit year: ");
                    scanner.next();
                }
                year = scanner.nextInt();
            } while (year < 1000 || year > 9999);

            // Logic to check if the year is a leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }


