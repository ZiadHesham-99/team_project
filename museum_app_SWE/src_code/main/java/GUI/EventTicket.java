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
public class EventTicket extends javax.swing.JFrame {

    /**
     * Creates new form EventTicket
     */
    public EventTicket() {
        initComponents();
        GUIManager.Instance().setDynamicSize(this, jPanel1);
          //Backend.BookingPage.Instance().showEventDetails(Details);
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
        Back = new javax.swing.JButton();
        Subtitle = new javax.swing.JLabel();
        Details = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        NId = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Phone = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Payment = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(1110, 1170));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 820));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/TicketBooking/Back.png"))); // NOI18N
        Back.setBorder(null);
        Back.setContentAreaFilled(false);
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 50, 60));

        Subtitle.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        Subtitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/Event Description/eye-of-ra 1.png"))); // NOI18N
        Subtitle.setText("  Event Ticket");
        jPanel1.add(Subtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 290, 60));

        Details.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel1.add(Details, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 810, 90));

        Time.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Time.setText("10:93 - 1:00 pm");
        jPanel1.add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 110, -1));

        Name.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(153, 153, 153));
        Name.setText("UserName");
        Name.setBorder(null);
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 550, -1));

        jSeparator2.setBackground(new java.awt.Color(160, 160, 160));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 820, 70));

        jSeparator1.setBackground(new java.awt.Color(160, 160, 160));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 820, 20));

        NId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NId.setForeground(new java.awt.Color(153, 153, 153));
        NId.setText("Visitor National ID");
        NId.setBorder(null);
        jPanel1.add(NId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 550, -1));

        jSeparator3.setBackground(new java.awt.Color(160, 160, 160));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 820, 20));

        Phone.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Phone.setForeground(new java.awt.Color(153, 153, 153));
        Phone.setText("Phone Number");
        Phone.setBorder(null);
        jPanel1.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 550, -1));

        jSeparator5.setBackground(new java.awt.Color(160, 160, 160));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 820, 20));

        Payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/TicketBooking/Payment.png"))); // NOI18N
        Payment.setBorder(null);
        Payment.setContentAreaFilled(false);
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });
        jPanel1.add(Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 690, 330, 70));

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
        jPanel1.add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 760, 190, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/TicketBooking/BG.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 980, 940));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/TicketBooking/Bitmap.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -50, 1080, 460));

        Error.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 0));
        Error.setText("jLabel4");
        jPanel1.add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 610, 460, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       
    }//GEN-LAST:event_jLabel1MouseClicked

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
         Backend.BookingPage.Instance().backButtom(this, new Events());
    }//GEN-LAST:event_BackMouseClicked

    private void ConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseClicked
        // TODO add your handling code here:
         // TODO add your handling code here:
        Backend.BookingPage.Instance().confirmEventTicketButtom(Name, NId, 
            Phone, 
            Error ,
            this , 
            new PaymentSelection());
    }//GEN-LAST:event_ConfirmMouseClicked

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
            java.util.logging.Logger.getLogger(EventTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel Details;
    private javax.swing.JLabel Error;
    private javax.swing.JTextField NId;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Payment;
    private javax.swing.JTextField Phone;
    private javax.swing.JLabel Subtitle;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
