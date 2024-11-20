import java.util.Scanner; // Importing Scanner for user input

public class GradeAverageCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialize variables to store grades
        double mathGrade, englishGrade, scienceGrade, historyGrade;
        double totalGrades, averageGrade;

        // Ask the user to enter grades
        System.out.print("Enter your Math grade: ");
        mathGrade = scanner.nextDouble(); // Read Math grade

        System.out.print("Enter your English grade: ");
        englishGrade = scanner.nextDouble(); // Read English grade

        System.out.print("Enter your Science grade: ");
        scienceGrade = scanner.nextDouble(); // Read Science grade

        System.out.print("Enter your History grade: ");
        historyGrade = scanner.nextDouble(); // Read History grade

        // Calculate the total of the grades
        totalGrades = mathGrade + englishGrade + scienceGrade + historyGrade;

        // Calculate the average grade
        averageGrade = totalGrades / 4;

        // Display the average grade to the user
        System.out.println("Your average grade is: " + averageGrade);

        // Use the ternary operator to decide pass or fail message
        String result = averageGrade >= 50
                ? "Congratulations! You passed."
                : "Unfortunately, you failed. Better luck next time!";

        // Print the result
        System.out.println(result);

        // Close the Scanner object
        scanner.close();
    }
}
