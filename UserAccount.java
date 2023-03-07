package Play2Win;

import java.util.List;
import java.util.ArrayList;

public class UserAccount {

    String username;
    String password;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    ArrayList<String> userCart = new ArrayList<String>();

    public UserAccount() {
        // No-arg constructor
    }

    public void setUsername(String username) {// Sets the username
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {// sets the password
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {// sets the user's first name
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {// sets the user's Last name
        this.lastName = lastName;
    }

    public void setEmail(String email) {// sets the user's email
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {// sets the user's phone number
        this.phoneNumber = phoneNumber;
    }

}
