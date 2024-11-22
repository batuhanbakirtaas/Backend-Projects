import java.util.Scanner;

public class UserAuthenticationAndReset {
    public static void main(String[] args) {
        // Variables for username and password
        String userName, password;

        // Scanner object to get user input
        Scanner inp = new Scanner(System.in);

        // Ask the user to enter their username
        System.out.print("Enter your username: ");
        userName = inp.nextLine();

        // Ask the user to enter their password
        System.out.print("Enter your password: ");
        password = inp.nextLine();

        // Check if the username and password are correct
        if (userName.equals("patika") && password.equals("java123")) {
            // If both username and password match, grant access
            System.out.println("You have successfully logged in!");
        } else {
            // If credentials are incorrect, display an error message
            System.out.println("Incorrect credentials!");

            // Ask the user if they want to reset their password
            System.out.print("Would you like to reset your password? (Yes/No): ");
            String resetResponse = inp.nextLine();

            // Check the user's response
            if (resetResponse.equalsIgnoreCase("Yes")) {
                // If the user wants to reset the password, ask for a new password
                System.out.print("Enter your new password: ");
                String newPassword = inp.nextLine();

                // Check if the new password is the same as the old one
                if (newPassword.equals(password)) {
                    // If the new password is the same as the old one, display an error message
                    System.out.println("Password could not be created, please enter a different password.");
                } else {
                    // If the new password is valid, accept it and display a success message
                    System.out.println("Password has been created successfully.");
                    // Update the old password with the new password
                    password = newPassword;
                }
            } else {
                // If the user does not want to reset the password, display a cancellation message
                System.out.println("Password reset operation has been canceled.");
            }
        }
    }
}
