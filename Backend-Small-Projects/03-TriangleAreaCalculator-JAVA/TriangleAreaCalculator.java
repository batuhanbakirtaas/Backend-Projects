import java.util.Scanner; // Importing Scanner for user input

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble(); // Read the base value

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble(); // Read the height value

        // Calculate the area of the triangle using the formula: (base * height) / 2
        double area = (base * height) / 2;

        // Display the calculated area to the user
        System.out.println("The area of the triangle is: " + area);

        // Close the Scanner object
        scanner.close();
    }
}
