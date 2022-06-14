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
public class DosenTetap extends Pegawai {
    public DosenTetap() {
        this.absen = "Absen Menggunakan Sidik Jari";
        this.status = "Dosen Tetap";
    }

    /**
     * @return the nip
     */
    public String getNip() {
        return nip;
    }
    
    @Override
    public void tampilData() {
        System.out.println("Nama Dosen   : " + this.getNama());
        System.out.println("Status Dosen : " + this.getStatus());
        System.out.println("NIP Dosen    : " + this.getNip());
        System.out.println("Cara Absen   : " + this.getAbsen());
        System.out.println("");
    }
}
