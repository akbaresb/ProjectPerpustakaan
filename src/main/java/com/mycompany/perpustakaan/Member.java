package com.mycompany.perpustakaan;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author akbar
 */
public class Member extends javax.swing.JFrame {
    private String encryptPassword(String password) {
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(password.getBytes("UTF-8"));
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    } catch (Exception ex) {
        return null;
    }
}
    
    private void tampilData() {
    // Membuat header tabel
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID Member");
    model.addColumn("Nama");
    model.addColumn("Email");
    model.addColumn("Nomer Telpon");
    model.addColumn("Alamat");
    try {
        // Query untuk mengambil data (Password tidak ditampilkan demi keamanan)
        String sql = "SELECT id_member, nama, email, telepon, alamat FROM anggota";
        Connection conn = (Connection) Koneksi.configDB();
        Statement stm = conn.createStatement();
        ResultSet res = stm.executeQuery(sql);

        while (res.next()) {
            model.addRow(new Object[]{
                res.getString("id_member"),
                res.getString("nama"),
                res.getString("email"),
                res.getString("telepon"),
                res.getString("alamat")
                    
            });
        }
        
        // Mengatur model ke JTable
        tabelMember.setModel(model);
        
    } catch (Exception e) {
        System.out.println("Error tampil data: " + e.getMessage());
    }
}
     private void kosongkanForm() {
    txtid.setText("");
    txtnama.setText("");
    txtemail.setText("");
    txttelepon.setText("");
    txtalamat.setText("");
    txtpassword.setText("");
    txtid.requestFocus();
}
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Member.class.getName());

    /**
     * Creates new form Buku
     */
    public Member() {
        this.setLocationRelativeTo(null);
        initComponents();
        tampilData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubmitBtn = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMember = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        txtpassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txttelepon = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtemail = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(this::SubmitBtnActionPerformed);
        getContentPane().add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 48, 146, -1));

        clear.setText("Clear");
        clear.addActionListener(this::clearActionPerformed);
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 171, 146, -1));

        closeBtn.setText("Close");
        closeBtn.addActionListener(this::closeBtnActionPerformed);
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 201, 146, -1));

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(this::UpdateBtnActionPerformed);
        getContentPane().add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 90, 146, -1));

        DelBtn.setText("Delete");
        DelBtn.addActionListener(this::DelBtnActionPerformed);
        getContentPane().add(DelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 129, 146, -1));

        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 132, -1, -1));

        jLabel4.setText("Nomor Telpon");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 174, -1, -1));

        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 204, -1, -1));

        txtid.setBackground(new java.awt.Color(30, 30, 46));
        txtid.setForeground(new java.awt.Color(205, 214, 244));
        txtid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "USERNAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 0, 15), new java.awt.Color(166, 173, 200))); // NOI18N
        txtid.setMinimumSize(new java.awt.Dimension(64, 55));
        txtid.setPreferredSize(new java.awt.Dimension(64, 55));
        txtid.addActionListener(this::txtidActionPerformed);
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 22, 240, 60));

        tabelMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Member", "Nama", "Email", "Nomor Telpon", "Alamat"
            }
        ));
        tabelMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelMemberMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMember);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 315, 735, -1));

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane2.setViewportView(txtalamat);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 201, 401, 64));
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 271, 401, -1));

        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 274, -1, -1));
        getContentPane().add(txttelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 171, 401, -1));

        jPanel1.setBackground(new java.awt.Color(42, 42, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(498, 498, 498)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
    
    String idanggota = txtid.getText();
    String nama = txtnama.getText();
    String email = txtemail.getText();
    String telepon = txttelepon.getText();
    String alamat = txtalamat.getText();
    
    String passInput = new String(txtpassword.getPassword());
    String encryptedPass = encryptPassword(passInput);
    if (idanggota.isEmpty() || nama.isEmpty() || email.isEmpty() || telepon.isEmpty() || alamat.isEmpty() || passInput.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(null, "LENGKAPI DATA!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
        
    } else {
    try {
        String passTerinkripsi = encryptPassword(new String(txtpassword.getPassword()));
        String sql = "INSERT INTO anggota VALUES (?, ?, ?, ?, ?,?)";
        
        java.sql.Connection conn = (java.sql.Connection) Koneksi.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        
        pst.setString(1, txtid.getText());
        pst.setString(2, txtnama.getText());
        pst.setString(3, txtemail.getText());
        pst.setString(4, txttelepon.getText());
        pst.setString(5, txtalamat.getText());
        pst.setString(6, passTerinkripsi);
        
        
        pst.execute();
        javax.swing.JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        tampilData(); 
         kosongkanForm();
    
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
    }      }  
    tampilData();               // TODO add your handling code here:
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
         // TODO add your handling code here:
         
    Main_Menu menu = new Main_Menu();
    menu.setVisible(true);
    menu.setLocationRelativeTo(null);
    this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
    String idanggota = txtid.getText();
    String nama = txtnama.getText();
    String email = txtemail.getText();
    String telepon = txttelepon.getText();
    String alamat = txtalamat.getText();
    
    String passInput = new String(txtpassword.getPassword());
    String encryptedPass = encryptPassword(passInput);
    if (idanggota.isEmpty() || nama.isEmpty() || email.isEmpty() || telepon.isEmpty() || alamat.isEmpty() || passInput.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(null, "LENGKAPI DATA!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
        
    } else {
    try {
        String passTerinkripsi = encryptPassword(new String(txtpassword.getPassword()));
        String sql = "UPDATE anggota SET nama=?, email=?, password=?, telepon=?, alamat=? WHERE id_member=?";
        
        java.sql.Connection conn = (java.sql.Connection) Koneksi.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        
        pst.setString(1, txtnama.getText());
        pst.setString(2, txtemail.getText());
        pst.setString(3, passTerinkripsi);
        pst.setString(4, txttelepon.getText());
        pst.setString(5, txtalamat.getText());
        pst.setString(6, txtid.getText()); // ID sebagai kunci
        
        pst.execute();
        javax.swing.JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        tampilData();
        kosongkanForm();
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
    }      }    // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBtnActionPerformed
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus data ini?", "Konfirmasi", javax.swing.JOptionPane.YES_NO_OPTION);
    
    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        try {
            String sql = "DELETE FROM anggota WHERE id_member=?";
            java.sql.Connection conn = (java.sql.Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, txtid.getText());
            
            pst.execute();
            javax.swing.JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            tampilData();
            kosongkanForm();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }             // TODO add your handling code here:
    }//GEN-LAST:event_DelBtnActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
    kosongkanForm();// TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void tabelMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMemberMousePressed
    if (evt.getClickCount() == 2) {
        // 1. Dapatkan index baris yang dipilih
        int baris = tabelMember.getSelectedRow();
        
        // 2. Ambil data dari tabel berdasarkan kolom (index mulai dari 0)
        String id = tabelMember.getValueAt(baris, 0).toString();
        String Nama = tabelMember.getValueAt(baris, 1).toString();
        String Email = tabelMember.getValueAt(baris, 2).toString();
        String Telepon = tabelMember.getValueAt(baris, 3).toString();
        String Alamat = tabelMember.getValueAt(baris, 4).toString();
        
        // 3. Set data ke TextField masing-masing
        txtid.setText(id);
        txtnama.setText(Nama);
        txtemail.setText(Email);
        txttelepon.setText(Telepon);
        txtalamat.setText(Alamat);
        
        // 4. Fokuskan ke password karena password biasanya tidak ditampilkan di tabel
        txtpassword.setText("");
        txtpassword.requestFocus();
        
        // Opsional: Berikan info bahwa data siap diedit
        System.out.println("Data " + id + " siap diupdate.");
    }         // TODO add your handling code here:
    }//GEN-LAST:event_tabelMemberMousePressed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Member().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelBtn;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton clear;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelMember;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnama;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txttelepon;
    // End of variables declaration//GEN-END:variables
}
