package Play2Win;
import java.util.*;

/**
 *
 * @author
 */

/*
 * In this class the Play2Win application will initiate the suer interface
 * requesting creation of a username and password.
 * The user will be prompted to enter a valid email address.
 * The user will be prompted to enter a valid phone number.
 * 
 * 
 * Once an account has been created the user will select the game they wish to
 * play.
 * Each game selected will generate 5 tickets of randomly generated numbers.
 * Predicted success graphics should be displayed next to each set of numbers on
 * each ticket.
 * 
 * 
 * The free user account will generate up to 3 tickets per game.
 * After 3 tickets have been generated the user will be prompted to upgrade to a
 * premium account or
 * unlock unlimited games for a year.
 * Payment is made through Paypal or Secure Debit/Credit Card.
 * 
 * Paymnent is a one time $24.99 fee or a monthly fee of $2.99/month.
 */
public class Play2WinApp {
    /*
     * This class creates the user interface
     * A prompt for username and password
     * First name, Last name and email address.
     * 
     * An instance of the UserAccount class will be created and each field will be
     * populated
     * with the user input.
     * 
     * Once all fields have a value the user will be prompted to select a game to
     * play.
     * 
     * The user data is stored in an arraylist of UserAccount objects.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<UserAccount> userAccount = new ArrayList<UserAccount>();
        UserAccount player = new UserAccount(); // instance of the UserAccount class

        System.out.println("Welcome to Play2Win" + "\n"
                + "To create a new a user account Enter 1" + "\n"
                + "To login to an existing account Enter 2" + "\n");
        String userInput = input.nextLine();

        switch (userInput) {
            case "1":
                // Prompt user for username and password
                System.out.println("Please enter a username: ");
                String username = input.nextLine();
                player.setUsername(username);// sets username
                System.out.println("Please enter a password: ");
                String password = input.nextLine();
                player.setPassword(password);// sets user password
                System.out.println("Please enter your first name: ");
                String firstName = input.nextLine();
                player.setFirstName(firstName);// sets user first name
                System.out.println("Please enter your last name: ");
                String lastName = input.nextLine();
                player.setLastName(lastName);// sets user last name
                System.out.println("Please enter your email address: ");
                String email = input.nextLine();
                player.setEmail(email);// sets user email
                System.out.println("Please enter your phone number: ");
                String phoneNumber = input.nextLine();
                player.setPhoneNumber(phoneNumber);// sets user phone number
                userAccount.add(player);// adds user to the arraylist of UserAccount objects

                break;

            case "2":
                System.out.println("Please enter your username: ");
                String username2 = input.nextLine();
                System.out.println("Please enter your password: ");
                String password2 = input.nextLine();
                // call the login method
                break;
        }

        System.out.println("User account created successfully!");
        System.out.println("Welcome to Play2Win");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n"
                + "1. MegaMillions" + "\n"
                + "2. PowerBall" + "\n"
                + "3. Ca$H4Life" + "\n"
                + "4. Cash5" + "\n"
                + "5. Pick4" + "\n"
                + "6. Pick3" + "\n"
                + "0. Exit" + "\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "Please select a game to create your ticket: ");

        int game = input.nextInt();

        // Create an instance of the game depending on the selected option

        switch (game) {
            case 1:
                MegaMillions megaMillions = new MegaMillions();
                ArrayList<String> megaticket = megaMillions.generateNumbers();
                for (int i = 0; i < megaticket.size(); i++) {
                    System.out.println(megaticket.get(i));
                }
                break;

            case 2:
                PowerBall powerBall = new PowerBall();
                ArrayList<String> powerticket = powerBall.generateNumbers();
                for (int i = 0; i < powerticket.size(); i++) {
                    System.out.println(powerticket.get(i));

                }
                break;
            case 3:
                Ca$h4Life cash4Life = new Ca$h4Life();
                ArrayList<String> cashticket = cash4Life.generateNumbers();
                for (int i = 0; i < cashticket.size(); i++) {
                    System.out.println(cashticket.get(i));
                }
                break;

            case 4:
                Cash5 cash5 = new Cash5();
                ArrayList<String> cash5ticket = cash5.generateNumbers();
                for (int i = 0; i < cash5ticket.size(); i++) {
                    System.out.println(cash5ticket.get(i));
                }
                break;

            case 5:
                Pick4 pick4 = new Pick4();
                ArrayList<String> pick4ticket = pick4.generateNumbers();
                for (int i = 0; i < pick4ticket.size(); i++) {
                    System.out.println(pick4ticket.get(i));

                }
                break;

            case 6:
                Pick3 pick3 = new Pick3();
                ArrayList<String> pick3ticket = pick3.generateNumbers();
                for (int i = 0; i < pick3ticket.size(); i++) {
                    System.out.println(pick3ticket.get(i));

                }
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
                break;
        }

        input.close();
    }
}
