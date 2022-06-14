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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar persegipanjang = new PersegiPanjang();
        System.out.println("Keliling : " + persegipanjang.hitungKeliling());
        System.out.println("Luas     : " + persegipanjang.hitungLuas());

    }

}
