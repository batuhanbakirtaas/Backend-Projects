import java.util.Scanner;

public class AscendingOrderNumberSorter {
    public static void main(String[] args) {
        // Variables to store the three numbers
        int num1, num2, num3;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        // Logic to sort the numbers in ascending order
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Sorted Order: " + num1 + " < " + num2 + " < " + num3);
            } else {
                System.out.println("Sorted Order: " + num1 + " < " + num3 + " < " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Sorted Order: " + num2 + " < " + num1 + " < " + num3);
            } else {
                System.out.println("Sorted Order: " + num2 + " < " + num3 + " < " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Sorted Order: " + num3 + " < " + num1 + " < " + num2);
            } else {
                System.out.println("Sorted Order: " + num3 + " < " + num2 + " < " + num1);
            }
        }
    }
}
