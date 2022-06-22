package Gui;
import javax.swing.JOptionPane;
import java.sql.*;
public class CekProfilMhs extends javax.swing.JFrame {
    private String sql;
    ResultSet rs;
    Statement stat;
    Connection conn = Helper.KoneksiDb.getconection();
    public CekProfilMhs() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cek Profil Mahasiswa");
        try {
            sql = "SELECT * FROM mahasiswa WHERE npm='"+JOptionPane.showInputDialog("Masukkan NPM untuk Konfirmasi")+"'";
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            while(rs.next()){
                fieldnama.setText(rs.getString("nama_mhs"));
                fieldnip.setText(rs.getString("npm"));
                fieldalmt.setText(rs.getString("alamat_mhs"));
                fieldnotelp.setText(rs.getString("notelp_mhs"));
                fieldpw.setText(rs.getString("password_mhs"));
            }
        }catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldpw = new javax.swing.JTextField();
        fieldnama = new javax.swing.JTextField();
        fieldnip = new javax.swing.JTextField();
        fieldalmt = new javax.swing.JTextField();
        fieldnotelp = new javax.swing.JTextField();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel1.setText("My Profile");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password     :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nama           : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("NPM            : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Alamat         : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("No Telp        :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        fieldpw.setEditable(false);
        fieldpw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fieldpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldpwActionPerformed(evt);
            }
        });
        jPanel1.add(fieldpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 200, 30));

        fieldnama.setEditable(false);
        fieldnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fieldnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldnamaActionPerformed(evt);
            }
        });
        jPanel1.add(fieldnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 200, 30));

        fieldnip.setEditable(false);
        fieldnip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fieldnip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldnipActionPerformed(evt);
            }
        });
        jPanel1.add(fieldnip, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 200, 30));

        fieldalmt.setEditable(false);
        fieldalmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fieldalmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldalmtActionPerformed(evt);
            }
        });
        jPanel1.add(fieldalmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 200, 30));

        fieldnotelp.setEditable(false);
        fieldnotelp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fieldnotelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldnotelpActionPerformed(evt);
            }
        });
        jPanel1.add(fieldnotelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 200, 30));

        back.setBackground(new java.awt.Color(255, 51, 51));
        back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 96, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldpwActionPerformed

    private void fieldnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldnamaActionPerformed

    private void fieldnipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldnipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldnipActionPerformed

    private void fieldalmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldalmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldalmtActionPerformed

    private void fieldnotelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldnotelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldnotelpActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        MenuMhs lgn = new MenuMhs();
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
            java.util.logging.Logger.getLogger(CekProfilMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CekProfilMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CekProfilMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekProfilMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CekProfilMhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField fieldalmt;
    private javax.swing.JTextField fieldnama;
    private javax.swing.JTextField fieldnip;
    private javax.swing.JTextField fieldnotelp;
    private javax.swing.JTextField fieldpw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
