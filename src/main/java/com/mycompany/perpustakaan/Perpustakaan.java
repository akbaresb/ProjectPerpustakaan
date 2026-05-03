/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpustakaan;

/**
 *
 * @author akbar
 */
public class Perpustakaan {

    public static void main(String[] args) {
      
      try {
    java.sql.Connection conn = (java.sql.Connection) Koneksi.configDB();
    if (conn != null) {
        System.out.println("Koneksi ke Database Berhasil!");
    }
    } catch (Exception e) {
    System.out.println("Koneksi Gagal: " + e.getMessage());
}
    }
    
}

