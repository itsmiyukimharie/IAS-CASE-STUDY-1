package Controller;

import Controller.SQLite;

public class UserController {

    private final SQLite sqlite = new SQLite();
    private final PasswordController passwordController = new PasswordController();
    
    /**
     * Registers a new user after checking if the username exists.
     */
    public boolean registerUser(String username, String email, String password) {
        try {
            
            String hashedPassword = passwordController.hashPassword(password);
            if (hashedPassword == null || hashedPassword.isEmpty()) {
                System.out.println("Error hashing the password.");
                return false;
            }

            // Save the new user to the database
            if (sqlite.addUser(username, email, hashedPassword)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Error during registration: " + ex.getMessage());
            return false;
        }
    }

    /**
     * Checks if a username already exists in the database.
     * 
     */
    public boolean doesUsernameExist(String username) {
        try {
            return sqlite.doesUsernameExist(username);
        } catch (Exception ex) {
            System.err.println("Error checking username existence: " + ex.getMessage());
            return false;
        }
    }
    
    /**
     * Checks if a email already exists in the database.
     * 
     */
    public boolean doesEmailExist(String email) {
        try {
            return sqlite.doesEmailExist(email);
        } catch (Exception ex) {
            System.err.println("Error checking email existence: " + ex.getMessage());
            return false;
        }
    }
}
