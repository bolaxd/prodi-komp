/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author user
 */
public class BangunDatar {

    private double panjang, lebar, tinggi, jariJari;
    public Scanner input;
    final double PHI = 3.14;

    BangunDatar() {
        Scanner input = new Scanner(System.in);
        this.input = input;
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
     * @return the jariJari
     */
    public double getJariJari() {
        return jariJari;
    }

    /**
     * @param jariJari the jariJari to set
     */
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungVolume(double p, double l, double t) {
        return (p * l * t);
    }

    public double hitungVolume(double jariJari, double t) {
        return (this.PHI * (jariJari * jariJari) * t);
    }

    public double hitungVolume(double jariJari) {
        double empatpertiga = (double) 4/3;
        return (empatpertiga * this.PHI * (jariJari * jariJari * jariJari));
    }

    public void mainMenu() {
        System.out.println("\nProgram Menghitung VOLUME Bangun Ruang");
        System.out.println("======================================");
        System.out.println("1) VOLUME Balok");
        System.out.println("2) VOLUME Tabung");
        System.out.println("3) VOLUME BOLA");
        System.out.print("\nPILIH BANGUN RUANG [1/2/3] : ");

        int input = this.input.nextInt();

        if (input == 1) {
            this.menuBalok();
        } else if (input == 2) {
            this.menuTabung();
        } else if (input == 3) {
            this.menuBola();
        } else {
            System.out.println("\nINPUT TIDAK DIKENALI!");
            this.mainMenu();
        }
    }
    
    public void toMainMenu() {
        String back2main = this.input.nextLine();
        if (back2main == "") {
            System.out.println("");
            this.mainMenu();    
        } else {
            System.out.println("");
            this.mainMenu();    
        }
    }
    
    public void menuBalok() {
        System.out.println("\nMENU BALOK");
        System.out.println("Masukan Nilai Panjang, Lebar, dan Tinggi");
        System.out.println("======================================");
        System.out.print("Panjang     : ");
        this.setPanjang(this.input.nextInt());
        System.out.print("Lebar       : ");
        this.setLebar(this.input.nextInt());
        System.out.print("Tinggi      : ");
        this.setTinggi(this.input.nextInt());
        
        System.out.println("\nTampil Volume Balok = " + this.hitungVolume(this.getPanjang(), this.getLebar(), this.getTinggi()));
    }

    public void menuTabung() {
        System.out.println("\nMENU TABUNG");
        System.out.println("Masukan Nilai Jari-jari & Tinggi");
        System.out.println("======================================");
        System.out.print("Jari-jari     : ");
        this.setJariJari(this.input.nextDouble());
        System.out.print("Tinggi        : ");
        this.setTinggi(this.input.nextDouble());
        
        System.out.println("\nTampil Volume Tabung = " + this.hitungVolume(this.getJariJari(), this.getTinggi()));
    }
    
    public void menuBola() {
        System.out.println("\nMENU BOLA");
        System.out.println("Masukan Nilai Jari-jari & Tinggi");
        System.out.println("======================================");
        System.out.print("Jari-jari     : ");
        this.setJariJari(this.input.nextDouble());
        
        System.out.println("\nTampil Volume Bola = " + this.hitungVolume(this.getJariJari()));
    }
}
