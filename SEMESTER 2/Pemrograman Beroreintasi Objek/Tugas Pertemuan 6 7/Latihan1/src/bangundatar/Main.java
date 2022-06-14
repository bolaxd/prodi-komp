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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar balok = new Balok();
        balok.setPanjang(10);
        balok.setLebar(5);
        balok.tampilVolume();
        
        BangunDatar tabung = new Tabung();
        tabung.setJarijari(10);
        tabung.setTinggi(8);
        tabung.tampilVolume();
        
        BangunDatar bola = new Bola();
        bola.setJarijari(10);
        bola.setTinggi(8);
        bola.tampilVolume();
    }
    
}
