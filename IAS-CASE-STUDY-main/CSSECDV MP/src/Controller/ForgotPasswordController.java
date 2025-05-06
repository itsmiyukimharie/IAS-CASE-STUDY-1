package Controller;

import javax.swing.JOptionPane;
import java.util.Random;
import javax.mail.MessagingException;
import utils.EmailSender;

public class ForgotPasswordController {

    private int randomCode;
    private String userEmail;
    private final SQLite sqlite = new SQLite();

    private int generateRandomCode() {
        return 100000 + new Random().nextInt(900000); // 6-digit code
    }

    public boolean sendResetEmail(String recipientEmail) {
        this.userEmail = recipientEmail;
        randomCode = generateRandomCode();
        String subject = "Password Reset Code";
        String content = "Your verification code is: " + randomCode;

        try {
            EmailSender.send(recipientEmail, subject, content); // ⬅ This uses javax.mail internally
            return true;
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Error sending email: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean verifyCode(int inputCode) {
        if (randomCode == 0) {
            return false;
        } 
        
        if(inputCode == randomCode){
            invalidateCode();
            return true;
        } else {
            return false;
        }
        
    }
    
    public void invalidateCode() {
        randomCode = 0;
    }
    
    public String getUserEmail() {
        return userEmail;
    }

    public boolean doesEmailExist(String email) {
        try {
            return sqlite.doesEmailExist(email);
        } catch (Exception ex) {
            System.err.println("Error checking email existence: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean updatePassword(String email, String password) {
        try {
            
            String hashedPassword = PasswordController.hashPassword(password);
            
            System.out.println(email + hashedPassword);
            if (sqlite.updatePassword(email, hashedPassword)) {
                return true;
            } else {
                return false;
            }
            
        } catch (Exception ex) {
            System.err.println("Error updating password: " + ex.getMessage());
            return false;
        }
    }
}
