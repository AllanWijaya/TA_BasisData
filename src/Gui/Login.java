package Gui;
import java.awt.Color;
import javax.swing.JFrame;
public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Sistem KRS");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MhsButton = new javax.swing.JButton();
        DsnButton = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        lgn = new javax.swing.JButton();
        Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setMaximizedBounds(new java.awt.Rectangle(800, 800, 800, 800));
        setMaximumSize(new java.awt.Dimension(800, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MhsButton.setBackground(new java.awt.Color(51, 51, 255));
        MhsButton.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        MhsButton.setForeground(new java.awt.Color(255, 255, 255));
        MhsButton.setActionCommand("=");
        MhsButton.setLabel("Login Mahasiswa");
        MhsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MhsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MhsButtonMouseExited(evt);
            }
        });
        MhsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MhsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MhsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 260, 50));

        DsnButton.setBackground(new java.awt.Color(51, 51, 255));
        DsnButton.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        DsnButton.setForeground(new java.awt.Color(255, 255, 255));
        DsnButton.setActionCommand("=");
        DsnButton.setLabel("Login Dosen");
        DsnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DsnButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DsnButtonMouseExited(evt);
            }
        });
        DsnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DsnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DsnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 260, 50));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(null);

        lgn.setBackground(new java.awt.Color(255, 51, 102));
        lgn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lgn.setForeground(new java.awt.Color(255, 255, 255));
        lgn.setText("EXIT");
        lgn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lgn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lgnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lgnMouseExited(evt);
            }
        });
        lgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgnActionPerformed(evt);
            }
        });
        bg.add(lgn);
        lgn.setBounds(250, 400, 73, 19);

        Login.setBackground(new java.awt.Color(102, 255, 255));
        Login.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 153, 255));
        Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login.setText("LOGIN");
        bg.add(Login);
        Login.setBounds(200, 60, 177, 81);

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DsnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DsnButtonActionPerformed
        dispose();
        LoginDsn lgndsn = new LoginDsn();
        lgndsn.setVisible(true);
    }//GEN-LAST:event_DsnButtonActionPerformed

    private void MhsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MhsButtonActionPerformed
        dispose();
        LoginMhs lgnmhs = new LoginMhs();
        lgnmhs.setVisible(true);
    }//GEN-LAST:event_MhsButtonActionPerformed

    private void lgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lgnActionPerformed

    private void DsnButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DsnButtonMouseEntered
        // TODO add your handling code here:
        DsnButton.setBackground(Color.pink);
        DsnButton.setForeground(Color.black);
    }//GEN-LAST:event_DsnButtonMouseEntered

    private void DsnButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DsnButtonMouseExited
        // TODO add your handling code here:
        DsnButton.setBackground(Color.blue);
        DsnButton.setForeground(Color.white);

    }//GEN-LAST:event_DsnButtonMouseExited

    private void MhsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MhsButtonMouseEntered
        // TODO add your handling code here:
        MhsButton.setBackground(Color.pink);
        MhsButton.setForeground(Color.black);
    }//GEN-LAST:event_MhsButtonMouseEntered

    private void MhsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MhsButtonMouseExited
        // TODO add your handling code here:
        MhsButton.setBackground(Color.blue);
        MhsButton.setForeground(Color.white);
    }//GEN-LAST:event_MhsButtonMouseExited

    private void lgnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnMouseEntered
        // TODO add your handling code here:
        lgn.setForeground(Color.black);

    }//GEN-LAST:event_lgnMouseEntered

    private void lgnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnMouseExited
        // TODO add your handling code here:
        lgn.setForeground(Color.white);

    }//GEN-LAST:event_lgnMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DsnButton;
    private javax.swing.JLabel Login;
    private javax.swing.JButton MhsButton;
    private javax.swing.JPanel bg;
    private javax.swing.JButton lgn;
    // End of variables declaration//GEN-END:variables
}
