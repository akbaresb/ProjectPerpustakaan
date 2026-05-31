/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.perpustakaan;

/**
 *
 * @author akbar
 */
public class Main_Menu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main_Menu.class.getName());

   
    private void aturTombolBerdasarkanRole(String role) {
        btnBuku.setVisible(false);
        btnPeminjaman.setVisible(false);
        btnPengembalian.setVisible(false);
        btnPetugas.setVisible(false);
        btnAnggota.setVisible(false);
        ReportBtn.setVisible(false);

        if (role.equalsIgnoreCase("inventaris")) {
            btnBuku.setVisible(true);
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            // Ganti jPanel1 dengan nama background/panel Anda
            int x = (jPanel1.getWidth() - btnBuku.getWidth()) / 2;
            int y = (jPanel1.getHeight() - btnBuku.getHeight()) / 2;
            btnBuku.setLocation(x, y);
        }
    });
            
        } else if (role.equalsIgnoreCase("resepsionis")) {
            btnPeminjaman.setVisible(true);
            btnPengembalian.setVisible(true);
            ReportBtn.setVisible(true);
            
        } else if (role.equalsIgnoreCase("member")) {
            btnPeminjaman.setVisible(true);
            btnPengembalian.setVisible(true);
            
        } else if (role.equalsIgnoreCase("admin") || role.equalsIgnoreCase("kepala_perpustakaan")) {
            btnBuku.setVisible(true);
            btnPeminjaman.setVisible(true);
            btnPengembalian.setVisible(true);
            btnPetugas.setVisible(true);
            btnAnggota.setVisible(true);
            ReportBtn.setVisible(true);
        }
    }
    /**
     * Creates new form Main_Menu
     */
   
    
    public Main_Menu() {
        initComponents();
        String roleAktif = userSession.getRole();
        aturTombolBerdasarkanRole(roleAktif);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPeminjaman = new javax.swing.JButton();
        btnPengembalian = new javax.swing.JButton();
        btnBuku = new javax.swing.JButton();
        btnPetugas = new javax.swing.JButton();
        btnAnggota = new javax.swing.JButton();
        ReportBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(42, 42, 60));
        jPanel1.setLayout(null);

        btnPeminjaman.setBackground(new java.awt.Color(166, 227, 161));
        btnPeminjaman.setText("Peminjaman");
        btnPeminjaman.addActionListener(this::btnPeminjamanActionPerformed);
        jPanel1.add(btnPeminjaman);
        btnPeminjaman.setBounds(110, 80, 137, 60);

        btnPengembalian.setBackground(new java.awt.Color(166, 227, 161));
        btnPengembalian.setText("Pengembalian");
        btnPengembalian.addActionListener(this::btnPengembalianActionPerformed);
        jPanel1.add(btnPengembalian);
        btnPengembalian.setBounds(280, 80, 137, 64);

        btnBuku.setBackground(new java.awt.Color(166, 227, 161));
        btnBuku.setText("Buku");
        btnBuku.setMaximumSize(new java.awt.Dimension(83, 24));
        btnBuku.setMinimumSize(new java.awt.Dimension(83, 24));
        btnBuku.setPreferredSize(new java.awt.Dimension(83, 24));
        btnBuku.addActionListener(this::btnBukuActionPerformed);
        jPanel1.add(btnBuku);
        btnBuku.setBounds(280, 160, 137, 60);

        btnPetugas.setBackground(new java.awt.Color(166, 227, 161));
        btnPetugas.setText("Petugas");
        btnPetugas.setMaximumSize(new java.awt.Dimension(83, 24));
        btnPetugas.setMinimumSize(new java.awt.Dimension(83, 24));
        btnPetugas.setPreferredSize(new java.awt.Dimension(83, 24));
        btnPetugas.addActionListener(this::btnPetugasActionPerformed);
        jPanel1.add(btnPetugas);
        btnPetugas.setBounds(280, 240, 137, 60);

        btnAnggota.setBackground(new java.awt.Color(166, 227, 161));
        btnAnggota.setText("Anggota");
        btnAnggota.addActionListener(this::btnAnggotaActionPerformed);
        jPanel1.add(btnAnggota);
        btnAnggota.setBounds(110, 240, 137, 60);

        ReportBtn.setBackground(new java.awt.Color(166, 227, 161));
        ReportBtn.setText("Report");
        ReportBtn.addActionListener(this::ReportBtnActionPerformed);
        jPanel1.add(ReportBtn);
        ReportBtn.setBounds(110, 160, 137, 60);

        jLabel1.setBackground(new java.awt.Color(137, 180, 250));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(137, 180, 250));
        jLabel1.setText("Menu");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 20, 103, 50);

        logoutbtn.setBackground(new java.awt.Color(243, 139, 168));
        logoutbtn.setText("Log Out");
        logoutbtn.addActionListener(this::logoutbtnActionPerformed);
        jPanel1.add(logoutbtn);
        logoutbtn.setBounds(420, 10, 90, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnggotaActionPerformed
    Member formMember = new Member();
    
    formMember.setVisible(true);
    formMember.setLocationRelativeTo(null);
    this.dispose(); 
    }//GEN-LAST:event_btnAnggotaActionPerformed

    private void btnPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengembalianActionPerformed
    Pengembalian formPengembalian = new Pengembalian();
    formPengembalian.setVisible(true);
    formPengembalian.setLocationRelativeTo(null);
    this.dispose(); 
    }//GEN-LAST:event_btnPengembalianActionPerformed

    private void btnBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBukuActionPerformed
        
    Buku formBuku = new Buku();
    formBuku.setVisible(true);
    formBuku.setLocationRelativeTo(null);
    this.dispose(); 

    }//GEN-LAST:event_btnBukuActionPerformed

    private void btnPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPetugasActionPerformed

    Petugas formPetugas = new Petugas();
    formPetugas.setVisible(true);
    formPetugas.setLocationRelativeTo(null);
    this.dispose();      
    }//GEN-LAST:event_btnPetugasActionPerformed

    private void btnPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeminjamanActionPerformed
    Peminjaman formPeminjaman = new Peminjaman();
    formPeminjaman.setVisible(true);
    formPeminjaman.setLocationRelativeTo(null);
    this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_btnPeminjamanActionPerformed

    private void ReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportBtnActionPerformed
     Laporan formLaporan = new Laporan();
     formLaporan.setVisible(true);
     formLaporan.setLocationRelativeTo(null);
       // TODO add your handling code here:
    }//GEN-LAST:event_ReportBtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed

    com.mycompany.perpustakaan.userSession.setRole(null);
    this.dispose();
    Login formLogin = new Login();
    formLogin.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbtnActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Main_Menu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReportBtn;
    private javax.swing.JButton btnAnggota;
    private javax.swing.JButton btnBuku;
    private javax.swing.JButton btnPeminjaman;
    private javax.swing.JButton btnPengembalian;
    private javax.swing.JButton btnPetugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutbtn;
    // End of variables declaration//GEN-END:variables
}
