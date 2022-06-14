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
public class Bola extends BangunDatar {  
    private double jarijari;
    
    public Bola() {
        
    }
    
    private double hitungVolume(BangunDatar bola) {
        double _4per3 = (double) 4 /3;
        bola.setVolume(_4per3 * Math.pow(this.getJarijari(), 3) * bola.getPHI());
        return bola.getVolume();
    }
    
    @Override
    public void tampilVolume() {
        System.out.println("TAMPIL VOLUME BOLA");
        System.out.println("Jari-jari Bola   = " + this.getJarijari());
        System.out.println("VOLUME BOLA      = " + this.hitungVolume(new BangunDatar()));
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
}
