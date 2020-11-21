/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan52;

import m10119002.pbo.latihan52.target.Dosen;
import m10119002.pbo.latihan52.target.Mahasiswa;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program siapa kamu
 * Pertemuan 5
 * 
 */
public class Program {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("1011069");
        mhs.setNama("Nindi");
        mhs.setUmur(17);
        mhs.setKelas("PBO2");
        
        System.out.println("NIP DOSEN : ".concat(dosen.getNip()));
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        System.out.println("");
        
        System.out.println("NIM MAHASISWA : ".concat(mhs.getNim()));
        mhs.siapaKamu();
        mhs.kelasApa();
    }
}
