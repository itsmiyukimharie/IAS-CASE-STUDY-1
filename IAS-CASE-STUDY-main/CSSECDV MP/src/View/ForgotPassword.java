package View;

import javax.swing.JOptionPane;
import Controller.ForgotPasswordController;

public class ForgotPassword extends javax.swing.JPanel {

    public Frame frame;
    ForgotPasswordController controller = new ForgotPasswordController();

    public ForgotPassword() {
        initComponents();
        codeInput.setEnabled(false);
        verifybtn.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        forgotpasswordlabel = new javax.swing.JLabel();
        forgotpasswordtitle = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        send_verificationbtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        codeInput = new javax.swing.JTextField();
        verifybtn = new javax.swing.JButton();
        forgotpasswordlabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(768, 498));

        forgotpasswordlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        forgotpasswordlabel.setForeground(new java.awt.Color(102, 102, 102));
        forgotpasswordlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotpasswordlabel.setText("Enter your registered email address");
        forgotpasswordlabel.setToolTipText("");
        forgotpasswordlabel.setMaximumSize(new java.awt.Dimension(368, 58));
        forgotpasswordlabel.setMinimumSize(new java.awt.Dimension(368, 58));
        forgotpasswordlabel.setName("label"); // NOI18N
        forgotpasswordlabel.setPreferredSize(new java.awt.Dimension(368, 58));

        forgotpasswordtitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        forgotpasswordtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotpasswordtitle.setText(" Forgot Password");
        forgotpasswordtitle.setToolTipText("");
        forgotpasswordtitle.setMaximumSize(new java.awt.Dimension(368, 58));
        forgotpasswordtitle.setMinimumSize(new java.awt.Dimension(368, 58));
        forgotpasswordtitle.setName("title"); // NOI18N
        forgotpasswordtitle.setPreferredSize(new java.awt.Dimension(368, 58));

        emailInput.setBackground(new java.awt.Color(240, 240, 240));
        emailInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailInput.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "EMAIL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        emailInput.setMinimumSize(new java.awt.Dimension(65, 50));
        emailInput.setPreferredSize(new java.awt.Dimension(64, 45));

        send_verificationbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        send_verificationbtn.setText("SEND VERIFICATION EMAIL");
        send_verificationbtn.setMaximumSize(new java.awt.Dimension(154, 36));
        send_verificationbtn.setMinimumSize(new java.awt.Dimension(154, 36));
        send_verificationbtn.setPreferredSize(new java.awt.Dimension(154, 36));
        send_verificationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_verificationbtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        codeInput.setBackground(new java.awt.Color(240, 240, 240));
        codeInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        codeInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codeInput.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "VERIFICATION CODE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        codeInput.setMinimumSize(new java.awt.Dimension(65, 50));
        codeInput.setPreferredSize(new java.awt.Dimension(64, 45));

        verifybtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        verifybtn.setText("Verify");
        verifybtn.setMaximumSize(new java.awt.Dimension(154, 36));
        verifybtn.setMinimumSize(new java.awt.Dimension(154, 36));
        verifybtn.setPreferredSize(new java.awt.Dimension(154, 36));
        verifybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifybtnActionPerformed(evt);
            }
        });

        forgotpasswordlabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        forgotpasswordlabel1.setForeground(new java.awt.Color(102, 102, 102));
        forgotpasswordlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotpasswordlabel1.setText("Enter the verification code");
        forgotpasswordlabel1.setToolTipText("");
        forgotpasswordlabel1.setMaximumSize(new java.awt.Dimension(368, 58));
        forgotpasswordlabel1.setMinimumSize(new java.awt.Dimension(368, 58));
        forgotpasswordlabel1.setName("label"); // NOI18N
        forgotpasswordlabel1.setPreferredSize(new java.awt.Dimension(368, 58));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(verifybtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(forgotpasswordlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                        .addComponent(forgotpasswordtitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codeInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(179, 179, 179)
                            .addComponent(send_verificationbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addComponent(forgotpasswordlabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(forgotpasswordtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(forgotpasswordlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(send_verificationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(forgotpasswordlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(codeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verifybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        forgotpasswordlabel.getAccessibleContext().setAccessibleName("Forgot Password");
    }// </editor-fold>//GEN-END:initComponents

    private void send_verificationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_verificationbtnActionPerformed
        codeInput.setText("");
        String email = emailInput.getText().trim();
        
        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Enter a valid email address.", "Verification failed", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!controller.doesEmailExist(email)) {
            JOptionPane.showMessageDialog(this, "Invalid email. Please enter the email associated to your account", "Verification failed", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        
        boolean sent = controller.sendResetEmail(email);

        if (sent) {
            JOptionPane.showMessageDialog(null, "Verification code sent! Check your email.");
            codeInput.setEnabled(true);
            verifybtn.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Failed to verify code. Please try again.");
            return;
        }
    }//GEN-LAST:event_send_verificationbtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        clearInputs();
        controller.invalidateCode();
        codeInput.setEnabled(false);
        verifybtn.setEnabled(false);
        frame.loginNav();
    }//GEN-LAST:event_backBtnActionPerformed

    private void verifybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifybtnActionPerformed
        String inputCode = codeInput.getText().trim();

        if (inputCode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the verification code.", "Input Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int enteredCode = Integer.parseInt(inputCode);

            if (controller.verifyCode(enteredCode)) {
                JOptionPane.showMessageDialog(this, "Verification successful. You may now reset your password.");
                clearInputs();
                codeInput.setEnabled(false);
                verifybtn.setEnabled(false);
                frame.resetpasswordNav(controller.getUserEmail());
            } else {
                JOptionPane.showMessageDialog(this, "Invalid verification code. Please try again.", "Verification Failed", JOptionPane.ERROR_MESSAGE);
                return;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Verification code must be numeric.", "Invalid Format", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_verifybtnActionPerformed

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
        return email.matches(emailRegex);
    }

    private void clearInputs() {
        emailInput.setText("");
        codeInput.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField codeInput;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel forgotpasswordlabel;
    private javax.swing.JLabel forgotpasswordlabel1;
    private javax.swing.JLabel forgotpasswordtitle;
    private javax.swing.JButton send_verificationbtn;
    private javax.swing.JButton verifybtn;
    // End of variables declaration//GEN-END:variables

}
