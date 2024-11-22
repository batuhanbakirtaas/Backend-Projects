import java.util.Scanner;

public class SmartCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();

        // Display menu options for the calculator
        System.out.println("Please choose the operation you want to perform:");
        System.out.println("1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");

        // Prompt the user to select an operation
        System.out.print("Your choice: ");
        int select = input.nextInt();

        // Use a switch statement to handle the selected operation
        switch (select) {
            case 1:
                // Perform addition
                System.out.println("Result (Addition): " + (n1 + n2));
                break;

            case 2:
                // Perform subtraction
                System.out.println("Result (Subtraction): " + (n1 - n2));
                break;

            case 3:
                // Perform multiplication
                System.out.println("Result (Multiplication): " + (n1 * n2));
                break;

            case 4:
                // Perform division if the second number is not zero
                if (n2 != 0) {
                    double result = (double) n1 / n2; // Convert to double for precise division
                    System.out.println("Result (Division): " + result);
                } else {
                    // Display an error message if dividing by zero
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;

            default:
                // Handle invalid input
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        // Close the scanner to release resources
        input.close();
    }
}
