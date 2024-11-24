import java.util.Scanner; // Importing Scanner for user input

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt(); // Read the year

        // Determine if the year is a leap year
        boolean isLeapYear;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // Years divisible by 100 are not leap years unless divisible by 400
                isLeapYear = (year % 400 == 0);
            } else {
                // Years divisible by 4 but not by 100 are leap years
                isLeapYear = true;
            }
        } else {
            // Years not divisible by 4 are not leap years
            isLeapYear = false;
        }

        // Display the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }

        // Close the scanner
        scanner.close();
    }
}