import java.util.Scanner; // Importing Scanner for user input

public class CircleSegmentArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble(); // Read the radius

        // Ask the user to enter the central angle of the segment (in degrees)
        System.out.print("Enter the central angle of the segment (in degrees): ");
        double angle = scanner.nextDouble(); // Read the angle

        // Calculate the area of the circle segment using the formula:
        // (π * r² * angle) / 360
        double segmentArea = (Math.PI * radius * radius * angle) / 360;

        // Display the calculated segment area
        System.out.println("The area of the circular segment is: " + segmentArea);

        // Close the Scanner object
        scanner.close();
    }
}
