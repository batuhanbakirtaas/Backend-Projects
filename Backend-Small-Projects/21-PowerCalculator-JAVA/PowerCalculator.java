import java.util.Scanner; // Import Scanner for user input

public class PowerCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base number
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        // Prompt the user to enter the exponent
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Initialize the result to 1 (multiplicative identity)
        int result = 1;

        // Calculate the power using a for loop
        for (int i = 1; i <= exponent; i++) {
            result *= base; // Multiply the result by the base in each iteration
        }

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
