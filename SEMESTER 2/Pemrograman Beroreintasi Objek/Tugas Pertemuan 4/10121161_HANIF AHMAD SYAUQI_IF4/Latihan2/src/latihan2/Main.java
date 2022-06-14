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
        Age tandanyakamu = new Age(2022);
        
        System.out.println("=======APLIKASI TANDANYA KAMU=======");
        System.out.print("Masukan Tahun Lahir Anda : ");
        tandanyakamu.setTahunLahir(input.nextInt());
        
        System.out.println("\n=======HASIL PERHITUNGAN UMUR=======");
        System.out.println("Tahun Lahir Anda    : " + tandanyakamu.getTahunLahir());
        System.out.println("Hari ini Tahun      : " + tandanyakamu.getTahunSkrg());
        System.out.println("Umur Kamu Saat ini  : " + tandanyakamu.hitungUmur() + " Tahun");
        System.out.println("TANDANYA KAMU       : " + tandanyakamu.tandanyaKamu(tandanyakamu.hitungUmur()));
    }
    
}
