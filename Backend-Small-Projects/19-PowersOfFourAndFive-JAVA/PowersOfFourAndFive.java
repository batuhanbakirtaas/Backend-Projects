import java.util.Scanner;

public class PowersOfFourAndFive {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Print powers of 4
        System.out.println("Powers of 4:");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }

        // Print powers of 5
        System.out.println("Powers of 5:");
        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }

        // Close the scanner
        scanner.close();
    }
}
