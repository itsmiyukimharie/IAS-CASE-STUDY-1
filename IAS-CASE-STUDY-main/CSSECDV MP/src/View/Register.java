package View;

import Controller.UserController;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JPanel {

    public Frame frame;

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerBtn = new javax.swing.JButton();
        usernameInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        passwordInput = new javax.swing.JPasswordField();
        confirmPasswordInput = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();
        showConfirmPassword = new javax.swing.JCheckBox();
        emailInput = new javax.swing.JTextField();

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        usernameInput.setBackground(new java.awt.Color(240, 240, 240));
        usernameInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameInput.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        passwordInput.setBackground(new java.awt.Color(240, 240, 240));
        passwordInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordInput.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        confirmPasswordInput.setBackground(new java.awt.Color(240, 240, 240));
        confirmPasswordInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirmPasswordInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confirmPasswordInput.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        showPassword.setText("Show Password");
        showPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        showConfirmPassword.setText("Show Password");
        showConfirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        showConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showConfirmPasswordActionPerformed(evt);
            }
        });

        emailInput.setBackground(new java.awt.Color(240, 240, 240));
        emailInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailInput.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "EMAIL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(confirmPasswordInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showConfirmPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(showPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showConfirmPassword)
                .addGap(18, 18, 18)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed

        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_])[A-Za-z\\d\\W_]{8,64}$";
        String usernamePattern = "^[A-Za-z0-9_-]{3,20}$";
        String emailregex = "^[A-Za-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$"; 
                
//        boolean hasError = false;
        char[] password = passwordInput.getPassword();
        char[] confirmPassword = confirmPasswordInput.getPassword();
        String username = usernameInput.getText().trim();
        String email = emailInput.getText().trim();
        String passwordStr = new String(password);
        String confirmPasswordStr = new String(confirmPassword);

        if (username.isEmpty() && email.isEmpty() && password.length == 0 && confirmPassword.length == 0) {
            JOptionPane.showMessageDialog(this, "All fields are required.", "Registration Failed", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username field is required.", "Registration Failed", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!username.matches(usernamePattern)) {
            JOptionPane.showMessageDialog(this, "Username must be between 3-20 characters and can only include letters, numbers, hyphens, and underscores", "Registration Failed", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email field is required.", "Registration Failed", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!email.matches(emailregex)) {
            JOptionPane.showMessageDialog(this, "Invalid email.", "Registration Failed", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (password.length == 0) {
            JOptionPane.showMessageDialog(this, "Password field is required.", "Registration Failed", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!passwordStr.matches(passwordPattern)) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long, include uppercase, lowercase, numbers, and special characters, and cannot exceed 64 characters.", "Registration Failed", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (confirmPassword.length == 0) {
            JOptionPane.showMessageDialog(this, "Confirm password field is required.", "Registration Failed", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!confirmPasswordStr.equals(passwordStr)) {
            JOptionPane.showMessageDialog(this, "Passwords don't match.", "Registration Failed", JOptionPane.ERROR_MESSAGE);
            return;
        } 

        Arrays.fill(password, ' ');
        Arrays.fill(confirmPassword, ' ');

        UserController userController = new UserController();

        // checks if username exists 
        if (userController.doesUsernameExist(username)) {
            JOptionPane.showMessageDialog(this, "Username already exists.", "Registration Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Username already exists.");
            return;
        }
        
        if (userController.doesEmailExist(email)) {
            JOptionPane.showMessageDialog(this, "Email already exists.", "Registration Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Email already exists.");
            return;
        }

        if (userController.registerUser(username, email, passwordStr)) {
            JOptionPane.showMessageDialog(null, "Register successfully!");
            System.out.println("Sumakses sya ");
            clearInputs();
            frame.loginNav();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to register. Please check your details", "Registration Failed", JOptionPane.ERROR_MESSAGE);
            clearInputs();
            System.out.println("Failed to add user, hindi sumakses");
            return;
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        clearInputs();
        frame.loginNav();
    }//GEN-LAST:event_backBtnActionPerformed

    private void showConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showConfirmPasswordActionPerformed

        if (showConfirmPassword.isSelected()) {
            confirmPasswordInput.setEchoChar((char) 0);
        } else {
            confirmPasswordInput.setEchoChar('•');
        }
    }//GEN-LAST:event_showConfirmPasswordActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed

        if (showPassword.isSelected()) {
            passwordInput.setEchoChar((char) 0);
        } else {
            passwordInput.setEchoChar('•');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void clearInputs() {
        usernameInput.setText("");
        emailInput.setText("");
        passwordInput.setText("");
        confirmPasswordInput.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPasswordField confirmPasswordInput;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JButton registerBtn;
    private javax.swing.JCheckBox showConfirmPassword;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}
