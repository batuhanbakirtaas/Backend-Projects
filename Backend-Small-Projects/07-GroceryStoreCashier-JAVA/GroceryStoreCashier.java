import java.util.Scanner; // Importing Scanner for user input

public class GroceryStoreCashier {
    public static void main(String[] args) {
        // Prices per kilogram for specific grocery items
        double applePricePerKg = 3.5; // Price of apples per kg
        double bananaPricePerKg = 2.2; // Price of bananas per kg
        double orangePricePerKg = 4.0; // Price of oranges per kg
        double tomatoPricePerKg = 1.8; // Price of tomatoes per kg
        double potatoPricePerKg = 1.5; // Price of potatoes per kg

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the weight of apples
        System.out.print("Enter the weight of apples (kg): ");
        double appleWeight = scanner.nextDouble();

        // Ask the user for the weight of bananas
        System.out.print("Enter the weight of bananas (kg): ");
        double bananaWeight = scanner.nextDouble();

        // Ask the user for the weight of oranges
        System.out.print("Enter the weight of oranges (kg): ");
        double orangeWeight = scanner.nextDouble();

        // Ask the user for the weight of tomatoes
        System.out.print("Enter the weight of tomatoes (kg): ");
        double tomatoWeight = scanner.nextDouble();

        // Ask the user for the weight of potatoes
        System.out.print("Enter the weight of potatoes (kg): ");
        double potatoWeight = scanner.nextDouble();

        // Calculate the total cost for each item
        double appleCost = appleWeight * applePricePerKg;
        double bananaCost = bananaWeight * bananaPricePerKg;
        double orangeCost = orangeWeight * orangePricePerKg;
        double tomatoCost = tomatoWeight * tomatoPricePerKg;
        double potatoCost = potatoWeight * potatoPricePerKg;

        // Calculate the overall total cost
        double totalCost = appleCost + bananaCost + orangeCost + tomatoCost + potatoCost;

        // Display the total cost to the user
        System.out.println("The total cost of your groceries is: " + totalCost + " units");

        // Close the Scanner object
        scanner.close();
    }
}
