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
        btnLogBook.setVisible(false);

        if (role.equalsIgnoreCase("inventaris")) {
            btnBuku.setVisible(true);
            
        } else if (role.equalsIgnoreCase("resepsionis")) {
            btnPeminjaman.setVisible(true);
            btnPengembalian.setVisible(true);
            btnLogBook.setVisible(true);
            
        } else if (role.equalsIgnoreCase("member")) {
            btnPeminjaman.setVisible(true);
            btnPengembalian.setVisible(true);
            
        } else if (role.equalsIgnoreCase("admin") || role.equalsIgnoreCase("kepala_perpustakaan")) {
            btnBuku.setVisible(true);
            btnPeminjaman.setVisible(true);
            btnPengembalian.setVisible(true);
            btnPetugas.setVisible(true);
            btnAnggota.setVisible(true);
            btnLogBook.setVisible(true);
        }
    }
    /**
     * Creates new form Main_Menu
     */
   
    
    public Main_Menu() {
        initComponents();
        String roleAktif = userSession.getRole();
        aturTombolBerdasarkanRole(roleAktif);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnggota = new javax.swing.JButton();
        btnPeminjaman = new javax.swing.JButton();
        btnPengembalian = new javax.swing.JButton();
        btnBuku = new javax.swing.JButton();
        btnLogBook = new javax.swing.JButton();
        btnPetugas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAnggota.setText("Anggota");
        btnAnggota.addActionListener(this::btnAnggotaActionPerformed);

        btnPeminjaman.setText("Peminjaman");
        btnPeminjaman.addActionListener(this::btnPeminjamanActionPerformed);

        btnPengembalian.setText("Pengembalian");
        btnPengembalian.addActionListener(this::btnPengembalianActionPerformed);

        btnBuku.setText("Buku");
        btnBuku.addActionListener(this::btnBukuActionPerformed);

        btnLogBook.setText("Log Book");

        btnPetugas.setText("Petugas");
        btnPetugas.addActionListener(this::btnPetugasActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnLogBook, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPengembalian)
                    .addComponent(btnLogBook)
                    .addComponent(btnPetugas)
                    .addComponent(btnAnggota))
                .addContainerGap(329, Short.MAX_VALUE))
        );

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
    private javax.swing.JButton btnAnggota;
    private javax.swing.JButton btnBuku;
    private javax.swing.JButton btnLogBook;
    private javax.swing.JButton btnPeminjaman;
    private javax.swing.JButton btnPengembalian;
    private javax.swing.JButton btnPetugas;
    // End of variables declaration//GEN-END:variables
}
