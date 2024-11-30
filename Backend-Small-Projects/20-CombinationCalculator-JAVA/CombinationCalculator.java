import java.util.Scanner;

public class CombinationCalculator {
    // Method to calculate factorial of a number
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter values for n and r
        System.out.print("Enter the value of n (total elements): ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r (selected elements): ");
        int r = scanner.nextInt();

        // Validate input
        if (n < r || n < 0 || r < 0) {
            System.out.println("Invalid input! n must be greater than or equal to r, and both must be non-negative.");
        } else {
            // Calculate combination using the formula: C(n, r) = n! / (r! * (n-r)!)
            int combination = factorial(n) / (factorial(r) * factorial(n - r));
            System.out.println("C(" + n + ", " + r + ") = " + combination);
        }

        // Close the scanner
        scanner.close();
    }
}
