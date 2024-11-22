import java.util.Scanner;

public class ActivitySuggestion {
    public static void main(String[] args) {
        int heat; // Variable to store the temperature input by the user

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: "); // Prompt the user to input the temperature
        heat = input.nextInt(); // Read the temperature value

        // Check if the temperature is less than 5
        if (heat < 5) {
            System.out.println("You can go skiing."); // Suggest skiing for temperatures below 5
        }
        // Check if the temperature is between 5 and 25
        else if (heat <= 25) {
            // Nested condition: Check if the temperature is 15 or below
            if (heat <= 15) {
                System.out.println("You can go to the cinema."); // Suggest going to the cinema
            }
            // Nested condition: Check if the temperature is 10 or above
            if (heat >= 10) {
                System.out.println("You can go for a picnic."); // Suggest going for a picnic
            }
        }
        // Check if the temperature is greater than 25
        else {
            System.out.println("You can go swimming."); // Suggest swimming for temperatures above 25
        }
    }
}
