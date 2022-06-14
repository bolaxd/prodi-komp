/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author user
 */
public class DosenLayanan extends Pegawai {
    public DosenLayanan() {
        this.absen = "Absen Menggunakan Tanda Tangan";
        this.status = "Dosen Luar Biasa";
    }
    
    @Override
    public void tampilData() {
        System.out.println("Nama Dosen   : " + this.getNama());
        System.out.println("Status Dosen : " + this.getStatus());
        System.out.println("Cara Absen   : " + this.getAbsen());
        System.out.println("");
    }
}
