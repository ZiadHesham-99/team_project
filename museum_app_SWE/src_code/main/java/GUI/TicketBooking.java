/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Dina
 */
public class TicketBooking extends javax.swing.JFrame {

    /**
     * Creates new form TicketBooking
     */
    public TicketBooking() {
        initComponents();
        GUIManager.Instance().setDynamicSize(this, jPanel1);
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
        time = new javax.swing.JLabel();
        Details = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Name = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        NId = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Phone = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Confirm = new javax.swing.JButton();
        Payment = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        Date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 820));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 820));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Subtitle.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        Subtitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/TicketBooking/Pen.png"))); // NOI18N
        Subtitle.setText("  Visit Ticket");
        jPanel1.add(Subtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 240, 60));

        time.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        time.setText("10:93 - 1:00 pm");
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 110, -1));
        time.getAccessibleContext().setAccessibleName("");

        Details.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Details.setText("10:93 - 1:00 pm");
        jPanel1.add(Details, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 110, -1));

        jSeparator1.setBackground(new java.awt.Color(160, 160, 160));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 820, 20));

        Name.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(153, 153, 153));
        Name.setText("Visitor Full name ");
        Name.setBorder(null);
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 550, -1));

        jSeparator2.setBackground(new java.awt.Color(160, 160, 160));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 820, 70));

        NId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NId.setForeground(new java.awt.Color(153, 153, 153));
        NId.setText("Visitor National ID");
        NId.setBorder(null);
        jPanel1.add(NId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 550, -1));

        jSeparator3.setBackground(new java.awt.Color(160, 160, 160));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 820, 20));

        Phone.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Phone.setForeground(new java.awt.Color(153, 153, 153));
        Phone.setText("Phone Number");
        Phone.setBorder(null);
        jPanel1.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 550, -1));

        jSeparator4.setBackground(new java.awt.Color(160, 160, 160));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 820, 10));

        jSeparator5.setBackground(new java.awt.Color(160, 160, 160));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 820, 20));

        Confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/TicketBooking/Confirm.png"))); // NOI18N
        Confirm.setBorder(null);
        Confirm.setContentAreaFilled(false);
        Confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmMouseClicked(evt);
            }
        });
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 730, 170, 60));

        Payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/TicketBooking/Payment.png"))); // NOI18N
        Payment.setBorder(null);
        Payment.setContentAreaFilled(false);
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });
        jPanel1.add(Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 650, 340, 80));

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/TicketBooking/Back.png"))); // NOI18N
        BackButton.setBorder(null);
        BackButton.setContentAreaFilled(false);
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, 60));

        Date.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Date.setForeground(new java.awt.Color(153, 153, 153));
        Date.setText(" Date of visit");
        Date.setBorder(null);
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 550, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/TicketBooking/BG.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 820));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 940, 720));

        Error.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 860, 390, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/TicketBooking/Bitmap.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1080, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 46, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmActionPerformed

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void ConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseClicked
        // TODO add your handling code here:
        Backend.BookingPage.Instance().confirmButtom(Name, NId, 
            Phone, 
            Date,
            Error ,
            this , 
            new PaymentSelection());
    }//GEN-LAST:event_ConfirmMouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        // TODO add your handling code here:
        Backend.BookingPage.Instance().backButtom(this, new Explore());
    }//GEN-LAST:event_BackButtonMouseClicked

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

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
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Confirm;
    private javax.swing.JTextField Date;
    private javax.swing.JLabel Details;
    private javax.swing.JLabel Error;
    private javax.swing.JTextField NId;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Payment;
    private javax.swing.JTextField Phone;
    private javax.swing.JLabel Subtitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
