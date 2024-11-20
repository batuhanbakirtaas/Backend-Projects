import java.util.Scanner; // Importing Scanner for user input

public class TaximeterCalculator {
    public static void main(String[] args) {
        // Define constants for taximeter calculation
        double baseFare = 10.0; // Fixed starting fee
        double ratePerKm = 2.5; // Cost per kilometer
        double minimumFare = 20.0; // Minimum charge for any ride

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the distance traveled
        System.out.print("Enter the distance traveled in kilometers: ");
        double distance = scanner.nextDouble(); // Read distance input

        // Calculate the fare
        double calculatedFare = baseFare + (ratePerKm * distance);

        // Set the final fare to the calculated fare or the minimum fare, whichever is higher
        double totalFare = calculatedFare < minimumFare ? minimumFare : calculatedFare;

        // Display the total fare
        System.out.println("The total fare is: " + totalFare + " units");

        // Close the Scanner object
        scanner.close();
    }
}
