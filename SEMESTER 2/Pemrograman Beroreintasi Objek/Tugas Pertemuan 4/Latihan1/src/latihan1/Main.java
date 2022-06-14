/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan1;

import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        Printer cetakan = new Printer();
        
        System.out.println("========Aplikasi Pencetak Nama========\n");
        
        System.out.print("Masukan Nama Anda : ");
        cetakan.setNama(input.nextLine());

        System.out.print("Mau Cetak Nama Berapa Kali ? : ");
        cetakan.setJumlahCetak(input.nextInt());
        
        System.out.println("Nama Anda   : " + cetakan.getNama());
        System.out.println("Hasil Cetak : ");
        cetakan.cetakDalamJumlah();
    }
    
}
