/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Backend.LoginPage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author bethoveen
 */
public class SignUpForm extends javax.swing.JFrame {

    /**
     * Creates new form SignUpForm
     */
    public SignUpForm() {
        initComponents();
        GUIManager.Instance().setDynamicSize(this,jPanel1);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Subtitle = new javax.swing.JLabel();
        Icon = new javax.swing.JLabel();
        MessageText = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Icon1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        SignUp = new javax.swing.JButton();
        SignIn1 = new javax.swing.JButton();
        ForgotPasswordButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 920));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1100, 1300));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Subtitle.setFont(new java.awt.Font("Cantarell", 0, 30)); // NOI18N
        Subtitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Signing/pharaoh (1).png"))); // NOI18N
        Subtitle.setText("Sign In to continue");
        Subtitle.setToolTipText("");
        Subtitle.setIconTextGap(10);
        jPanel1.add(Subtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 320, 60));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Signing/Icon.png"))); // NOI18N
        jPanel1.add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        MessageText.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        MessageText.setForeground(new java.awt.Color(255, 51, 51));
        MessageText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(MessageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 550, 80));

        Username.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(153, 153, 153));
        Username.setText("Username");
        Username.setBorder(null);
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
        });
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 630, 40));

        jSeparator1.setBackground(new java.awt.Color(151, 151, 151));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 690, 10));

        Icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Signing/Password.png"))); // NOI18N
        jPanel1.add(Icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("Password123123");
        jPasswordField1.setBorder(null);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 670, 40));

        jSeparator2.setBackground(new java.awt.Color(151, 151, 151));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 690, 10));

        SignUp.setBackground(new java.awt.Color(0, 0, 0));
        SignUp.setForeground(new java.awt.Color(0, 0, 0));
        SignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Signing/Signup.png"))); // NOI18N
        SignUp.setBorder(null);
        SignUp.setBorderPainted(false);
        SignUp.setContentAreaFilled(false);
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpMouseClicked(evt);
            }
        });
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        jPanel1.add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, 490, 110));

        SignIn1.setBackground(new java.awt.Color(0, 0, 0));
        SignIn1.setForeground(new java.awt.Color(0, 0, 0));
        SignIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Signing/SignIn.png"))); // NOI18N
        SignIn1.setBorder(null);
        SignIn1.setBorderPainted(false);
        SignIn1.setContentAreaFilled(false);
        SignIn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignIn1MouseClicked(evt);
            }
        });
       
        jPanel1.add(SignIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 490, 110));

        ForgotPasswordButton.setBackground(new java.awt.Color(255, 255, 255));
        ForgotPasswordButton.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 18)); // NOI18N
        ForgotPasswordButton.setForeground(new java.awt.Color(153, 153, 153));
        ForgotPasswordButton.setText("Forgot Password ?");
        ForgotPasswordButton.setBorder(null);
        ForgotPasswordButton.setBorderPainted(false);
        ForgotPasswordButton.setContentAreaFilled(false);
        
        jPanel1.add(ForgotPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 240, 50));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 240, 20));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Signing/Rectangle 3 (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 940, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
        Username.setText("");
    }//GEN-LAST:event_UsernameFocusGained

    private void SignIn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignIn1MouseClicked
        // TODO add your handling code here:
        
        Backend.LoginPage.Instance().signInButtom(Username, jPasswordField1, MessageText, this, new Explore() );
        //LoginPage login = new LoginPage("jdbc:mysql://localhost:3306/trial2?zeroDateTimeBehavior=convertToNull","root","");
        //login.signInButtom(Username,jPasswordField1,MessageText,this,new Explore());
        //login.signInButtom(Username, Username, TEXT_CURSOR, Icon, this, this);
    }//GEN-LAST:event_SignIn1MouseClicked

    private void SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpMouseClicked
        // TODO add your handling code here:
        Backend.LoginPage.Instance().signUpButton(this, new SignUp());
    }//GEN-LAST:event_SignUpMouseClicked

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ForgotPasswordButton;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel Icon1;
    private javax.swing.JLabel MessageText;
    private javax.swing.JButton SignIn1;
    private javax.swing.JButton SignUp;
    private javax.swing.JLabel Subtitle;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
