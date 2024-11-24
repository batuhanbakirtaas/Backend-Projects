import java.util.Scanner; // Importing Scanner for user input

public class FlightTicket {
    public static void main(String[] args) {
        // Define constants
        final double PRICE_PER_KM = 0.10; // Cost per kilometer
        final double CHILD_DISCOUNT = 0.50; // Discount for age < 12
        final double YOUTH_DISCOUNT = 0.10; // Discount for age between 12 and 24
        final double SENIOR_DISCOUNT = 0.30; // Discount for age > 65
        final double ROUND_TRIP_DISCOUNT = 0.20; // Discount for round-trip tickets

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the distance in km: ");
        int distance = scanner.nextInt();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the trip type (1 => One Way, 2 => Round Trip): ");
        int tripType = scanner.nextInt();

        // Validate input
        if (distance <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Invalid Input! Please enter positive values and valid trip type.");
        } else {
            // Calculate the base fare
            double normalFare = distance * PRICE_PER_KM;

            // Apply age discounts
            double ageDiscount = 0;
            if (age < 12) {
                ageDiscount = normalFare * CHILD_DISCOUNT;
            } else if (age >= 12 && age <= 24) {
                ageDiscount = normalFare * YOUTH_DISCOUNT;
            } else if (age > 65) {
                ageDiscount = normalFare * SENIOR_DISCOUNT;
            }

            double discountedFare = normalFare - ageDiscount;

            // Apply round-trip discount if applicable
            if (tripType == 2) {
                discountedFare -= discountedFare * ROUND_TRIP_DISCOUNT;
                discountedFare *= 2; // Multiply by 2 for round trip
            }

            // Display the total fare
            System.out.println("Total Fare = " + discountedFare + " TL");
        }
        // Close the scanner
        scanner.close();
    }
}