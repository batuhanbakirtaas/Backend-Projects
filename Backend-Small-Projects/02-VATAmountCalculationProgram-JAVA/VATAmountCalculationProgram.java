import java.util.Scanner; // Importing Scanner for user input

public class VATAmountCalculationProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the price of the product
        System.out.print("Enter the price of the product: ");
        double price = scanner.nextDouble(); // Read the product price

        // Determine the VAT rate using a ternary operator
        // If the price is greater than or equal to 1000, VAT rate is 18% (0.18)
        // Otherwise, the VAT rate is 8% (0.08)
        double vatRate = price >= 1000 ? 0.18 : 0.08;

        // Calculate the VAT amount
        double vatAmount = price * vatRate;

        // Calculate the total price including VAT
        double totalPrice = price + vatAmount;

        // Display the results
        System.out.println("Price of the product: " + price);
        System.out.println("VAT rate: " + (vatRate * 100) + "%");
        System.out.println("VAT amount: " + vatAmount);
        System.out.println("Total price (including VAT): " + totalPrice);

        // Close the Scanner object
        scanner.close();
    }
}
