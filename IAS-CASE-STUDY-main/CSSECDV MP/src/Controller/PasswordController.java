
package Controller;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class PasswordController {
    
    // Method to hash the password with a specified strength (e.g., 12)
    public static String hashPassword(String password) {
        // Generate a salt and hash the password
        BCrypt.Hasher hasher = BCrypt.withDefaults();
        return hasher.hashToString(12, password.toCharArray());
    }

    // Check if the plain password matches the hashed password
    public static boolean checkPassword(String plainPassword, String hashedPassword) {
        BCrypt.Result result = BCrypt.verifyer().verify(plainPassword.toCharArray(), hashedPassword);
        return result.verified;
    }

}
