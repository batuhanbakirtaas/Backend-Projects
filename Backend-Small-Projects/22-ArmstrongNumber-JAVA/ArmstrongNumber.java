import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int tempNumber = number; // Temporary variable to manipulate the number
        int digitCount = 0; // To count the digits of the number
        int result = 0; // To store the sum of powers of digits

        // Count the number of digits
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCount++;
        }

        tempNumber = number; // Reset tempNumber to the original number

        // Calculate the sum of the digits raised to the power of digitCount
        while (tempNumber != 0) {
            int digit = tempNumber % 10; // Extract the last digit
            int power = 1;

            // Calculate digit^digitCount
            for (int i = 1; i <= digitCount; i++) {
                power *= digit;
            }

            result += power; // Add the power to the result
            tempNumber /= 10; // Remove the last digit
        }

        // Check if the number is an Armstrong number
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner
        input.close();
    }
}
