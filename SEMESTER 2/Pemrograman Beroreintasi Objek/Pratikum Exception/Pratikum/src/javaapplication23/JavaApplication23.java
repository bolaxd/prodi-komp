/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication23 {
    public static void main(String[] args) {
        Scanner inputBilangan = new Scanner(System.in);
        
        System.out.println("Program Menghitung Pembagian Bilangan");
        System.out.println("=====================================");
        try {
            System.out.print("Bilangan 1 : ");
            int bilangan1 = inputBilangan.nextInt();
            System.out.print("Bilangan 2 : ");
            int bilangan2 = inputBilangan.nextInt();
            double hasilBilangan = bilangan1 / bilangan2;
            System.out.println("Hasil pembagian : " + hasilBilangan);   
        } catch (InputMismatchException e) {
            System.out.println("Terjadi error : " + e);
            System.out.println("Kayanya itu bukan angka deh ..");
        } catch (ArithmeticException e){
            System.out.println("Terjadi error : " + e);
            if (e.getMessage().equals("/ by zero")) System.out.println("Tidak bisa dibagi nol!");
        }
        
        
        
        System.out.println("\nProgram normal");
    }
    
}
