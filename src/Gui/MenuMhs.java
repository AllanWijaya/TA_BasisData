package Gui;
public class MenuMhs extends javax.swing.JFrame {
    public MenuMhs() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menu Mahasiswa");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cekprof = new javax.swing.JButton();
        daftarkrs = new javax.swing.JButton();
        cekjdwl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(255, 51, 51));
        back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU MAHASISWA");

        cekprof.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cekprof.setText("Cek Profil");
        cekprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekprofActionPerformed(evt);
            }
        });

        daftarkrs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        daftarkrs.setText("Daftar KRS");
        daftarkrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarkrsActionPerformed(evt);
            }
        });

        cekjdwl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cekjdwl.setText("Cek Jadwal");
        cekjdwl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekjdwlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(153, 153, 153))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cekprof, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daftarkrs, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cekjdwl, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(cekprof, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(daftarkrs, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(cekjdwl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        LoginMhs lgn = new LoginMhs();
        lgn.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void cekprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekprofActionPerformed
        dispose();
        CekProfilMhs tes = new CekProfilMhs();
        tes.setVisible(true);
    }//GEN-LAST:event_cekprofActionPerformed

    private void daftarkrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarkrsActionPerformed
        dispose();
        DataDaftarKRS tes = new DataDaftarKRS();
        tes.setVisible(true);
    }//GEN-LAST:event_daftarkrsActionPerformed

    private void cekjdwlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekjdwlActionPerformed
        dispose();
        DataJdwlMhs tes = new DataJdwlMhs();
        tes.setVisible(true);
    }//GEN-LAST:event_cekjdwlActionPerformed

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
            java.util.logging.Logger.getLogger(MenuMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel bg;
    private javax.swing.JButton cekjdwl;
    private javax.swing.JButton cekprof;
    private javax.swing.JButton daftarkrs;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
