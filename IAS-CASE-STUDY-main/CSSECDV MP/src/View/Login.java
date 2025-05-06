package View;

import Controller.LoginController;

import Model.User;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.time.Duration;
import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalDateTime;

public class Login extends javax.swing.JPanel {

    public Frame frame;
    private int attempt = 5;
    private int lockoutCount = 0;
    private LocalDateTime lockTime = null;

    public Login() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usernameFld = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        passwordFld = new javax.swing.JPasswordField();
        forgotpasswordbtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        usernameFld.setName(""); // NOI18N
        usernameFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFldActionPerformed(evt);
            }
        });

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        passwordFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFldActionPerformed(evt);
            }
        });

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.setMaximumSize(new java.awt.Dimension(154, 36));
        loginBtn.setMinimumSize(new java.awt.Dimension(154, 36));
        loginBtn.setPreferredSize(new java.awt.Dimension(154, 36));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        forgotpasswordbtn.setText("Forgot Password");
        forgotpasswordbtn.setActionCommand("ForgotPassword");
        forgotpasswordbtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        forgotpasswordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotpasswordbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(forgotpasswordbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showPassword))
                    .addComponent(passwordFld)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                    .addComponent(usernameFld)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showPassword)
                    .addComponent(forgotpasswordbtn))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        forgotpasswordbtn.getAccessibleContext().setAccessibleName("Forgot Password?");
    }// </editor-fold>//GEN-END:initComponents
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // insert logic here
        String username = usernameFld.getText();
        String password = new String(passwordFld.getPassword());

        // Check if permanently locked out
        if (lockoutCount >= 3) {
            JOptionPane.showMessageDialog(this, "Account locked permanently.\nPlease contact the administration.");
            loginBtn.setEnabled(false);
            return;
        }

        // Check if currently locked out for 15 minutes (1 minute lang muna nilagay for testing)
        if (lockTime != null) {
            Duration duration = Duration.between(lockTime, LocalDateTime.now());
            if (duration.toMinutes() < 1) {
                long minutesLeft = 1 - duration.toMinutes();
                JOptionPane.showMessageDialog(this, "Account temporarily locked. Try again in " + minutesLeft + " minute(s).");
                return;
            } else {
                // Lockout period reset
                attempt = 5;
                lockTime = null;
            }
        }

        // Message Prompt
        if (username.isEmpty() && (password.isEmpty())) {
            JOptionPane.showMessageDialog(this, "Please enter your username and password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        } else if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your username");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your password");
        } else { // If username and password is not empty, validate user credentials
            Controller.LoginController controller = new Controller.LoginController();
            int result = controller.validateLogin(username, password);
            
            switch (result) {
                case 0:
                    attempt--;
                    
                    if (attempt > 0) {
                        JOptionPane.showMessageDialog(this, "Invalid username or password. \nAttempts left: " + attempt + "/5", "Login Failed", JOptionPane.ERROR_MESSAGE);
                    } else if (attempt == 0) {
                        lockoutCount++;
                        
                        if (lockoutCount >= 3) {
                            JOptionPane.showMessageDialog(this, "Account locked permanently.\nPlease contact the administration.");
                            loginBtn.setEnabled(false);
                            return;
                        } else {
                            lockTime = LocalDateTime.now();
                            JOptionPane.showMessageDialog(this, "Too many failed attempts.\nAccount locked for 15 minutes.");
                            return;
                        }
                    }

                    return;
                case 1: // Disabled
                    JOptionPane.showMessageDialog(this, "Your account is disabled. Please contact the administrator.", "Login Failed", JOptionPane.ERROR_MESSAGE);
                    return;
                case 2: // client
                    JOptionPane.showMessageDialog(this, "Login successful!");
                    resetLockout();
                    clearInputs();
                    frame.setUserRole(2);
                    frame.mainNav();
                    return;
                case 3: //staff
                    JOptionPane.showMessageDialog(this, "Login successful!");
                    resetLockout();
                    clearInputs();
                    frame.setUserRole(3);
                    frame.mainNav();
                    return;
                case 4: //manager
                    JOptionPane.showMessageDialog(this, "Login successful!");
                    resetLockout();
                    clearInputs();
                    frame.setUserRole(4);
                    frame.mainNav();
                    return;
                case 5: //administrator
                    JOptionPane.showMessageDialog(this, "Login successful!");
                    resetLockout();
                    clearInputs();
                    frame.setUserRole(5);
                    frame.mainNav();
                    return;
                case 6: // locked account by admin
                    JOptionPane.showMessageDialog(this, "Your account is locked. Please contact the administrator.", "Login Failed", JOptionPane.ERROR_MESSAGE);
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void resetLockout() {
        attempt = 5;
        lockoutCount = 0;
        lockTime = null;
    }

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        resetLockout();
        clearInputs();
        frame.registerNav();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        // TODO add your handling code here:
        if (showPassword.isSelected()) {
            passwordFld.setEchoChar((char) 0);
        } else {
            passwordFld.setEchoChar('•');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void clearInputs() {
        usernameFld.setText("");
        passwordFld.setText("");
    }
    private void forgotpasswordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotpasswordbtnActionPerformed
        resetLockout();
        clearInputs();
        frame.forgotpasswordNav();
    }//GEN-LAST:event_forgotpasswordbtnActionPerformed


    private void passwordFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFldActionPerformed

    private void usernameFldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgotpasswordbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
