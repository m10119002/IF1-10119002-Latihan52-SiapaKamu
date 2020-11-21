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
 * Deskripsi Program : Class untuk objek Dosen
 * Pertemuan 5
 * 
 */
public class Dosen extends Manusia {
    private String nip;
    private String mataKuliah;
    
    public String getNip() {return this.nip;}
    public void setNip(String nip) {this.nip = nip;}
    public String getMataKuliah() {return this.mataKuliah;}
    public void setMataKuliah(String mataKuliah) {this.mataKuliah = mataKuliah;}
    public void mengajarApa()
    {System.out.println("Saya ".concat(this.nama).
            concat(" umur ").concat(Integer.toString(this.umur)).
            concat(" tahun sedang mengajar matakuliah ".concat(this.mataKuliah)));}
    @Override
    public void siapaKamu()
    {System.out.println("Saya Dosen");}
}
