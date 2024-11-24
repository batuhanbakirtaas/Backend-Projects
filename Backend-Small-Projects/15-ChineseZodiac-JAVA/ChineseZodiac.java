import java.util.Scanner; // Importing Scanner for user input

public class ChineseZodiac {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt(); // Read birth year

        // Calculate the zodiac sign based on the remainder when divided by 12
        int zodiacIndex = birthYear % 12;
        String zodiac = "";

        // Determine the zodiac sign using if-else
        if (zodiacIndex == 0) {
            zodiac = "Monkey";
        } else if (zodiacIndex == 1) {
            zodiac = "Rooster";
        } else if (zodiacIndex == 2) {
            zodiac = "Dog";
        } else if (zodiacIndex == 3) {
            zodiac = "Pig";
        } else if (zodiacIndex == 4) {
            zodiac = "Rat";
        } else if (zodiacIndex == 5) {
            zodiac = "Ox";
        } else if (zodiacIndex == 6) {
            zodiac = "Tiger";
        } else if (zodiacIndex == 7) {
            zodiac = "Rabbit";
        } else if (zodiacIndex == 8) {
            zodiac = "Dragon";
        } else if (zodiacIndex == 9) {
            zodiac = "Snake";
        } else if (zodiacIndex == 10) {
            zodiac = "Horse";
        } else if (zodiacIndex == 11) {
            zodiac = "Sheep";
        }

        // Display the result
        System.out.println("Your Chinese Zodiac Sign: " + zodiac);

        // Close the scanner
        scanner.close();
    }
}
