/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan52.target;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Mahasiswa
 * Pertemuan 5
 * 
 */
public class Mahasiswa extends Manusia {
    private String nim;
    private String kelas;
    
    public String getNim() {return this.nim;}
    public void setNim(String nim) {this.nim = nim;}
    public String getKelas() {return this.kelas;}
    public void setKelas(String kelas) {this.kelas = kelas;}
    public void kelasApa()
    {System.out.println("Saya ".concat(this.nama).
            concat(" umur ").concat(Integer.toString(this.umur)).
            concat(" tahun sedang belajar di kelas ".concat(this.kelas)));}
    @Override
    public void siapaKamu()
    {System.out.println("Saya Mahasiswa");}
}
