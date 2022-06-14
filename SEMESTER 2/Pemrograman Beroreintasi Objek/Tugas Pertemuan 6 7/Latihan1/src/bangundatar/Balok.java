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
public class Balok extends BangunDatar {   
    private double panjang, lebar;
    
    public Balok() {
        
    }
    
    private double hitungVolume(BangunDatar balok) {
        balok.setVolume(this.getPanjang() * this.getLebar());
        return balok.getVolume();
    }
    
    @Override
    public void tampilVolume() {
        System.out.println("TAMPIL VOLUME BALOK");
        System.out.println("Panjang Balok    = " + this.getPanjang());
        System.out.println("Lebar Balok      = " + this.getLebar());
        System.out.println("VOLUME BALOK     = " + this.hitungVolume(new BangunDatar()));
        System.out.println("");
    }

    /**
     * @return the panjang
     */
    @Override
    public double getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    @Override
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    @Override
    public double getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    @Override
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
}
