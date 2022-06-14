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
public class Pegawai {
    private String nama;
    public String nip, absen, status;
    
    public Pegawai() {
        
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
    * @param nip the nip to set
    */
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @return the absen
     */
    public String getAbsen() {
        return absen;
    }
    
    public void tampilData() {
        
    }
}
