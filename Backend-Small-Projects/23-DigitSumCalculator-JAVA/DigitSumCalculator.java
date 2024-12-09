import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0; // To store the sum of digits
        int tempNumber = Math.abs(number); // Take the absolute value to handle negative numbers

        // Calculate the sum of the digits
        while (tempNumber != 0) {
            sum += tempNumber % 10; // Add the last digit to the sum
            tempNumber /= 10; // Remove the last digit
        }

        // Display the result
        System.out.println("The sum of the digits is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
