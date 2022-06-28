/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Kalkulator {
    private int bilangan1, bilangan2;

    /**
     * @return the bilangan1
     */
    public int getBilangan1() {
        return bilangan1;
    }

    /**
     * @param bilangan1 the bilangan1 to set
     */
    public void setBilangan1(int bilangan1) {
        this.bilangan1 = bilangan1;
    }

    /**
     * @return the bilangan2
     */
    public int getBilangan2() {
        return bilangan2;
    }

    /**
     * @param bilangan2 the bilangan2 to set
     */
    public void setBilangan2(int bilangan2) {
        this.bilangan2 = bilangan2;
    }
    
    public void tambahBilangan() throws NumberValidationException { 
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Bilangan 1 : ");
            this.setBilangan1(input.nextInt());
            System.out.print("Bilangan 2 : ");
            this.setBilangan2(input.nextInt());
        } catch (InputMismatchException e) {
            String message = "Bilangan harus bertipe data Integer!";
            throw new NumberValidationException(message);
        }
    }
    
    public void tampilHasilBilangan() {
        double hasilBagi = this.hasilBagi();
        System.out.println("Hasil Pembagian : " + hasilBagi);
    }
    
    public double hasilBagi() {
        return this.getBilangan1() / this.getBilangan2();
    }
}
