/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author user
 */
public class BangunDatar {
    private String namaBangunDatar;
    private double panjang, lebar,
                   jarijari, tinggi,
                   volume;
    private final double PHI = 3.14;


    
    public BangunDatar() {
        
    }
    
    public BangunDatar(String namaBangunDatar) {
        this.namaBangunDatar = namaBangunDatar;
    }
    
    public void tampilVolume() {
        System.out.println("TAMPIL VOLUME " + this.namaBangunDatar);
    }

    /**
     * @return the namaBangunDatar
     */
    public String getNamaBangunDatar() {
        return namaBangunDatar;
    }

    /**
     * @return the panjang
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the jarijari
     */
    public double getJarijari() {
        return jarijari;
    }

    /**
     * @param jarijari the jarijari to set
     */
    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    /**
     * @return the tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * @return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * @return the PHI
     */
    public double getPHI() {
        return PHI;
    }

}
