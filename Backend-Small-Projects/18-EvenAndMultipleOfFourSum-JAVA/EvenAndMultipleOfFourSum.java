import java.util.Scanner;

public class EvenAndMultipleOfFourSum {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        int number; // Variable to hold the input number
        int sum = 0; // Variable to store the sum of valid numbers

        do {
            // Prompt user to enter a number
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            // Check if the number is even and a multiple of 4
            if (number % 2 == 0 && number % 4 == 0) {
                sum += number; // Add the number to the sum
            }
        } while (number % 2 == 0); // Loop continues while the number is even

        // Display the total sum
        System.out.println("The sum of numbers that are even and multiples of 4 is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
