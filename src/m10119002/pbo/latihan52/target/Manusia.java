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
 * Deskripsi Program : Class untuk objek Manusia
 * Pertemuan 5
 * 
 */
public class Manusia {
    protected String nama;
    protected int umur;
    
    public String getNama() {return this.nama;}
    public void setNama(String nama) {this.nama = nama;}
    public int getUmur() {return this.umur;}
    public void setUmur(int umur) {this.umur = umur;}
    public void siapaKamu() {System.out.println("Saya manusia");}
}
