public class AverageCalculator {
    public static void main(String[] args) {
        // User input: Enter a number
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variables to store sum and count
        int sum = 0, count = 0;

        // Loop through numbers from 0 to the given number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) { // Check divisibility by 3 and 4
                sum += i; // Add to sum
                count++; // Increment count
            }
        }

        // Calculate average
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average of numbers divisible by 3 and 4 is: " + average);
        } else {
            System.out.println("No numbers divisible by 3 and 4 found.");
        }

        // Close scanner
        scanner.close();
    }
}
