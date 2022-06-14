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
public class Tabung extends BangunDatar {   
    private double jarijari, tinggi;
    
    public Tabung() {
        
    }
    
    private double hitungVolume(BangunDatar tabung) {
        tabung.setVolume(tabung.getPHI() * Math.pow(this.getJarijari(), 2) * this.getTinggi());
        return tabung.getVolume();
    }
    
    @Override
    public void tampilVolume() {
        System.out.println("TAMPIL VOLUME TABUNG");
        System.out.println("Jari-jari Tabung = " + this.getJarijari());
        System.out.println("Tinggi Tabung    = " + this.getTinggi());
        System.out.println("VOLUME TABUNG    = " + this.hitungVolume(new BangunDatar()));
        System.out.println("");
    }

    /**
     * @return the jarijari
     */
    @Override
    public double getJarijari() {
        return jarijari;
    }

    /**
     * @param jarijari the jarijari to set
     */
    @Override
    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    /**
     * @return the tinggi
     */
    @Override
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    @Override
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
