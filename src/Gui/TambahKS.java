package Gui;
import Helper.KoneksiDb;
import javax.swing.JOptionPane;
import java.sql.*;
public class TambahKS extends javax.swing.JFrame {
    private String sql;
    ResultSet rs;
    Statement stat;
    Connection conn = Helper.KoneksiDb.getconection();
    public TambahKS() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Tambah Kartu Studi");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fieldidrg = new javax.swing.JTextField();
        fieldidks = new javax.swing.JTextField();
        fieldiddsn = new javax.swing.JTextField();
        fieldidmatkul = new javax.swing.JTextField();
        fieldjam = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        id_ruang = new javax.swing.JComboBox<>();
        id_ks = new javax.swing.JComboBox<>();
        id_dosen = new javax.swing.JComboBox<>();
        id_matkul = new javax.swing.JComboBox<>();
        jadwal = new javax.swing.JComboBox<>();
        fieldhari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel1.setText("Tambah Kartu Studi");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        fieldidrg.setEditable(false);
        fieldidrg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fieldidrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldidrgActionPerformed(evt);
            }
        });
        jPanel1.add(fieldidrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 200, 30));

        fieldidks.setEditable(false);
        fieldidks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fieldidks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldidksActionPerformed(evt);
            }
        });
        jPanel1.add(fieldidks, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 200, 30));

        fieldiddsn.setEditable(false);
        fieldiddsn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fieldiddsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldiddsnActionPerformed(evt);
            }
        });
        jPanel1.add(fieldiddsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 200, 30));

        fieldidmatkul.setEditable(false);
        fieldidmatkul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fieldidmatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldidmatkulActionPerformed(evt);
            }
        });
        jPanel1.add(fieldidmatkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 200, 30));

        fieldjam.setEditable(false);
        fieldjam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fieldjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldjamActionPerformed(evt);
            }
        });
        jPanel1.add(fieldjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 200, 30));

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

        id_ruang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_ruangActionPerformed(evt);
            }
        });
        jPanel1.add(id_ruang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 120, 30));

        id_ks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_ksActionPerformed(evt);
            }
        });
        jPanel1.add(id_ks, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 120, 30));

        id_dosen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tes1" }));
        id_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_dosenActionPerformed(evt);
            }
        });
        jPanel1.add(id_dosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 120, 30));

        id_matkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_matkulActionPerformed(evt);
            }
        });
        jPanel1.add(id_matkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 120, 30));

        jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadwalActionPerformed(evt);
            }
        });
        jPanel1.add(jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, 30));

        fieldhari.setEditable(false);
        fieldhari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fieldhari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldhariActionPerformed(evt);
            }
        });
        jPanel1.add(fieldhari, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 200, 30));

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

    private void fieldidrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldidrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldidrgActionPerformed

    private void fieldidksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldidksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldidksActionPerformed

    private void fieldiddsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldiddsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldiddsnActionPerformed

    private void fieldidmatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldidmatkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldidmatkulActionPerformed

    private void fieldjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldjamActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        MenuAdmin lgn = new MenuAdmin();
        lgn.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void id_ruangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_ruangActionPerformed
        try{
            KoneksiDb knksi = new KoneksiDb();
            Connection conn = knksi.getconection();
            stat=conn.createStatement();
            rs=stat.executeQuery("select id_ruang from ruang"
            );
            while(rs.next()){
                id_ruang.addItem(Integer.toString(rs.getInt("id_ruang")));
                fieldidrg.setText(rs.getString("nama_ruang"));
            }  
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_id_ruangActionPerformed

    private void id_ksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_ksActionPerformed
        
    }//GEN-LAST:event_id_ksActionPerformed

    private void id_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_dosenActionPerformed
        try{
            KoneksiDb knksi = new KoneksiDb();
            Connection conn = knksi.getconection();
            stat=conn.createStatement();
            rs=stat.executeQuery("select id_dosen from dosen"
            );
            while(rs.next()){
                id_dosen.addItem(Integer.toString(rs.getInt("id_dosen")));
                fieldiddsn.setText(rs.getString("nama_dosen"));
            }  
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_id_dosenActionPerformed

    private void id_matkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_matkulActionPerformed
        try{
            KoneksiDb knksi = new KoneksiDb();
            Connection conn = knksi.getconection();
            stat=conn.createStatement();
            rs=stat.executeQuery("select id_matkul from matkul"
            );
            while(rs.next()){
                id_matkul.addItem(Integer.toString(rs.getInt("id_matkul")));
                fieldidmatkul.setText(rs.getString("nama_matkul"));
            }  
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_id_matkulActionPerformed

    private void jadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadwalActionPerformed
        try{
            KoneksiDb knksi = new KoneksiDb();
            Connection conn = knksi.getconection();
            stat=conn.createStatement();
            rs=stat.executeQuery("select id_jadwal from jadwal"
            );
            while(rs.next()){
                jadwal.addItem(Integer.toString(rs.getInt("id_jadwal")));
                fieldhari.setText(rs.getString("hari"));
                fieldjam.setText(rs.getString("jam"));
            }  
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jadwalActionPerformed

    private void fieldhariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldhariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldhariActionPerformed

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
            java.util.logging.Logger.getLogger(TambahKS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahKS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahKS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahKS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahKS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField fieldhari;
    private javax.swing.JTextField fieldiddsn;
    private javax.swing.JTextField fieldidks;
    private javax.swing.JTextField fieldidmatkul;
    private javax.swing.JTextField fieldidrg;
    private javax.swing.JTextField fieldjam;
    private javax.swing.JComboBox<String> id_dosen;
    private javax.swing.JComboBox<String> id_ks;
    private javax.swing.JComboBox<String> id_matkul;
    private javax.swing.JComboBox<String> id_ruang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jadwal;
    // End of variables declaration//GEN-END:variables
}
