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
        
        initComponents();
        tampilData();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtpassword = new javax.swing.JPasswordField();
        txttelepon = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMember = new javax.swing.JTable();
        closeBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        SubmitBtn = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(30, 30, 46));

        txtpassword.setBackground(new java.awt.Color(30, 30, 46));
        txtpassword.setForeground(new java.awt.Color(166, 173, 200));
        txtpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 214, 244), 2), "PASSWORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(166, 173, 200))); // NOI18N

        txttelepon.setBackground(new java.awt.Color(30, 30, 46));
        txttelepon.setForeground(new java.awt.Color(166, 173, 200));
        txttelepon.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 214, 244), 2), "NOMOR TELEPON", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(166, 173, 200))); // NOI18N

        txtemail.setBackground(new java.awt.Color(30, 30, 46));
        txtemail.setForeground(new java.awt.Color(166, 173, 200));
        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 214, 244), 2), "EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(166, 173, 200))); // NOI18N

        txtnama.setBackground(new java.awt.Color(30, 30, 46));
        txtnama.setForeground(new java.awt.Color(166, 173, 200));
        txtnama.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 214, 244), 2), "NAMA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(166, 173, 200))); // NOI18N

        txtid.setBackground(new java.awt.Color(30, 30, 46));
        txtid.setForeground(new java.awt.Color(205, 214, 244));
        txtid.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 214, 244), 2), "USERNAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(166, 173, 200))); // NOI18N
        txtid.setMinimumSize(new java.awt.Dimension(64, 55));
        txtid.setPreferredSize(new java.awt.Dimension(64, 55));
        txtid.addActionListener(this::txtidActionPerformed);

        txtalamat.setBackground(new java.awt.Color(30, 30, 46));
        txtalamat.setColumns(20);
        txtalamat.setForeground(new java.awt.Color(166, 173, 200));
        txtalamat.setRows(5);
        txtalamat.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 214, 244), 2), "ALAMAT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(166, 173, 200))); // NOI18N
        jScrollPane2.setViewportView(txtalamat);

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

        closeBtn.setBackground(new java.awt.Color(243, 139, 168));
        closeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(this::closeBtnActionPerformed);

        UpdateBtn.setBackground(new java.awt.Color(137, 180, 250));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(this::UpdateBtnActionPerformed);

        DelBtn.setBackground(new java.awt.Color(243, 139, 168));
        DelBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DelBtn.setText("Delete");
        DelBtn.addActionListener(this::DelBtnActionPerformed);

        SubmitBtn.setBackground(new java.awt.Color(166, 227, 161));
        SubmitBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(this::SubmitBtnActionPerformed);

        clear.setBackground(new java.awt.Color(137, 180, 250));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(this::clearActionPerformed);

        jLabel1.setBackground(new java.awt.Color(137, 180, 250));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(137, 180, 250));
        jLabel1.setText("MEMBER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UpdateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SubmitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(DelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubmitBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(DelBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeBtn)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
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
