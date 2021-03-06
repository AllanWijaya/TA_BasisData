package Gui;
import Model.MahasiswaModel;
import javax.swing.JOptionPane;
import java.sql.*;
public class LoginDsn extends javax.swing.JFrame {
    private String sql;
    ResultSet rs;
    Statement stat;
    Connection conn = Helper.KoneksiDb.getconection();
    public LoginDsn() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Login Dosen");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        fieldnim = new javax.swing.JTextField();
        fieldpw = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Password    :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 325, 141, 46));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("NIP            : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 279, 152, -1));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldnim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bg.add(fieldnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 278, 155, 40));

        fieldpw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldpwActionPerformed(evt);
            }
        });
        bg.add(fieldpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 336, 155, 40));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        jLabel3.setText("DOSEN");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 22, 280, -1));

        Login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        bg.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 415, 120, 40));

        back.setBackground(new java.awt.Color(255, 51, 51));
        back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        bg.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 96, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logindosen.jpg"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setMaximumSize(new java.awt.Dimension(200, 200));
        jLabel4.setMinimumSize(new java.awt.Dimension(200, 200));
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 390, 220));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:

          try {
            sql = "SELECT * FROM dosen WHERE nip='"+fieldnim.getText()+"' AND password_dosen='"+fieldpw.getText()+"'";
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            if(rs.next()){
                if(fieldnim.getText().equals("admin") && fieldpw.getText().equals("admin")){
                    
                    JOptionPane.showMessageDialog(null, "Berhasil login","Login Dosen",JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Selamat datang, "+rs.getString("nama_dosen"),"Login Dosen",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    MenuAdmin dsn=new MenuAdmin();
                    dsn.setVisible(true);
                }
                else if(fieldnim.getText().equals(rs.getString("nip")) && fieldpw.getText().equals(rs.getString("password_dosen"))){
                    
                    JOptionPane.showMessageDialog(null, "Berhasil login","Login Dosen",JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Selamat datang, "+rs.getString("nama_dosen"),"Login Dosen",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    MenuDsn dsn=new MenuDsn();
                    dsn.setVisible(true);
                }
                
            }else{
                    JOptionPane.showMessageDialog(null, "Gagal Login","Login Dosen",JOptionPane.INFORMATION_MESSAGE);
                    fieldnim.setText(null);
                    fieldpw.setText(null);
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    
    }//GEN-LAST:event_LoginActionPerformed

    private void fieldpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldpwActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        Login lgn = new Login();
        lgn.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(LoginDsn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDsn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDsn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDsn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginDsn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton back;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField fieldnim;
    private javax.swing.JPasswordField fieldpw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
