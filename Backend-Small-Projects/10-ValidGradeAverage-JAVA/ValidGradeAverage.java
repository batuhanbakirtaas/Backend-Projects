import java.util.Scanner;

public class ValidGradeAverage {
    public static void main(String[] args) {
        // Define variables for grades and initialize the scanner
        int math, physics, turkish, chemistry, music;
        int total = 0; // To store the sum of valid grades
        int validGradeCount = 0; // To count the valid grades
        Scanner input = new Scanner(System.in);

        // Get grades from the user for each subject
        System.out.print("Enter your Mathematics grade: ");
        math = input.nextInt();
        if (math >= 0 && math <= 100) {
            total += math;
            validGradeCount++;
        }

        System.out.print("Enter your Physics grade: ");
        physics = input.nextInt();
        if (physics >= 0 && physics <= 100) {
            total += physics;
            validGradeCount++;
        }

        System.out.print("Enter your Turkish grade: ");
        turkish = input.nextInt();
        if (turkish >= 0 && turkish <= 100) {
            total += turkish;
            validGradeCount++;
        }

        System.out.print("Enter your Chemistry grade: ");
        chemistry = input.nextInt();
        if (chemistry >= 0 && chemistry <= 100) {
            total += chemistry;
            validGradeCount++;
        }

        System.out.print("Enter your Music grade: ");
        music = input.nextInt();
        if (music >= 0 && music <= 100) {
            total += music;
            validGradeCount++;
        }

        // Calculate and display the average of valid grades
        if (validGradeCount > 0) {
            double average = (double) total / validGradeCount;
            System.out.println("Your average grade is: " + average);

            // Check if the student passes or fails
            if (average >= 55) {
                System.out.println("You passed! Congratulations!");
            } else {
                System.out.println("You failed. Better luck next time!");
            }
        } else {
            System.out.println("No valid grades were entered. Unable to calculate average.");
        }
    }
}
