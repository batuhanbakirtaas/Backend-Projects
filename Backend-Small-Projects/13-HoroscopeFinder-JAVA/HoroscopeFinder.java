import java.util.Scanner; // Importing Scanner for user input

public class HoroscopeFinder {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their birth month and day
        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt(); // Read month input
        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt(); // Read day input

        // Variable to store the horoscope
        String horoscope = "";

        // Determine the horoscope based on month and day
        if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            horoscope = "Aries (Koç)";
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            horoscope = "Taurus (Boğa)";
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
            horoscope = "Gemini (İkizler)";
        } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
            horoscope = "Cancer (Yengeç)";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            horoscope = "Leo (Aslan)";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            horoscope = "Virgo (Başak)";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            horoscope = "Libra (Terazi)";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            horoscope = "Scorpio (Akrep)";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            horoscope = "Sagittarius (Yay)";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            horoscope = "Capricorn (Oğlak)";
        } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
            horoscope = "Aquarius (Kova)";
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            horoscope = "Pisces (Balık)";
        } else {
            horoscope = "Invalid date entered!";
        }

        // Display the result
        System.out.println("Your horoscope is: " + horoscope);

        // Close the Scanner
        scanner.close();
    }
}
