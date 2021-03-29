/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fs112b.latihan56.barangantik;

/**
 *
 * @author 
 * NAMA     : Muhamad Bagas Permana
 * KELAS    : FS112B-PBO
 * NIK      : 2022431570
 * Deskripsi Program	: Program ini berisi program untuk menampilkan
 * nama dan umur barang antik
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setNama("Radio AM");
        System.out.println("Nama barang Antik : "+radio.getNama());
        radio.tampilUmur();
    }
}