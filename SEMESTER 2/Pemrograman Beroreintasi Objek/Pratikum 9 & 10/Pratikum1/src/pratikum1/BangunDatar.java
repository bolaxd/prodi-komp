/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pratikum1;

/**
 *
 * @author LAB05
 */
public abstract class BangunDatar {
    private int panjang, lebar;

    public int getPanjang() {
        return panjang;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public abstract double hitungKeliling();
    public abstract double hitungLuas();
}
