/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        Pengemudi driver = null;

        System.out.print("Masukan Tipe Mobil [1/2] : ");
        int tipeMobil = input.nextInt();

        switch (tipeMobil) {
            case 1:
                Mobil avanza = new Avanza();
                driver = new Pengemudi(avanza);
                driver.melihatSpesifikasi();
                driver.menyalakanMobil();
                driver.menginjakGas();
                break;
            case 2:
                Mobil brio = new Brio();
                driver = new Pengemudi(brio);
                driver.melihatSpesifikasi();
                driver.menyalakanMobil();
                driver.menginjakGas();
                break;
            default:
                System.out.println("Maaf inputan Salah!");
        }
    }
    
}
