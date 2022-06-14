    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

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
        System.out.println("=======[ APLIKASI MENGHITUNG INDEKS NILAI & NILAI AKHIR MHS IF ]=======");
        
        Scanner input = new Scanner(System.in);
        
        Mahasiswa mhs1 = new Mahasiswa(1, "Teknik Informatika");
        System.out.println("Masukan Identitas dan Nilai Mahasiswa ke-" + mhs1.getUrutan());
        System.out.print("Nama Mahasiswa    : ");
        mhs1.setNama(input.nextLine());
        System.out.print("NIM Mahasiswa     : ");
        mhs1.setNim(input.nextLine());
        System.out.print("Kelas Mahasiswa   : ");
        mhs1.setKelas(input.nextLine());
        System.out.print("Input Nilai Tugas : ");
        mhs1.setTugas(input.nextInt());
        System.out.print("Input Nilai UTS   : ");
        mhs1.setUts(input.nextInt());
        System.out.print("Input Nilai UAS   : ");
        mhs1.setUas(input.nextInt());
        
        Mahasiswa mhs2 = new Mahasiswa(2, "Teknik Informatika");
        System.out.println("\nMasukan Identitas dan Nilai Mahasiswa ke-" + mhs2.getUrutan());
        System.out.print("Nama Mahasiswa    : ");
        input.nextLine();
        mhs2.setNama(input.nextLine());
        System.out.print("NIM Mahasiswa     : ");
        mhs2.setNim(input.nextLine());
        System.out.print("Kelas Mahasiswa   : ");
        mhs2.setKelas(input.nextLine());
        System.out.print("Input Nilai Tugas : ");
        mhs2.setTugas(input.nextInt());
        System.out.print("Input Nilai UTS   : ");
        mhs2.setUts(input.nextInt());
        System.out.print("Input Nilai UAS   : ");
        mhs2.setUas(input.nextInt());
        
        
        System.out.println("======================================================");
        mhs1.tampilData();
        System.out.println("");
        mhs2.tampilData();
    }
    
}
