package Controller;

import Controller.SQLite;
import Model.User;

public class LoginController {

    private final SQLite sqlite = new SQLite();

    public int validateLogin(String username, String password) {
        try {
            // Retrieve the user from the database
            User user = sqlite.getUser(username);

            if (user == null) {
                return 0; // Invalid credentials
            }

            if (!PasswordController.checkPassword(password, user.getPassword())) {
                return 0; // Invalid credentials
            }
            
            if (user.getLocked() != 0) {
                return 6; // Account locked by admin
            }

            return user.getRole(); 

        } catch (Exception e) {
            e.printStackTrace(); // Optional: log to file or use logger
            return -1; // -1 can indicate an internal error
        }

    }

}
