import java.util.Scanner; // Importing Scanner for user input

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their weight in kilograms
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble(); // Read weight

        // Ask the user to enter their height in meters
        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble(); // Read height

        // Calculate the BMI using the formula: weight / (height * height)
        double bmi = weight / (height * height);

        // Display the calculated BMI
        System.out.println("Your Body Mass Index (BMI) is: " + bmi);

        // Close the Scanner object
        scanner.close();
    }
}
