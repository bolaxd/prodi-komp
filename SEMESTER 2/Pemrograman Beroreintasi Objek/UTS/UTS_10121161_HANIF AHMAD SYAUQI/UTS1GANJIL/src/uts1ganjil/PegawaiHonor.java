/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1ganjil;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PegawaiHonor extends Pegawai {
    private int totalGaji, jumlahHari;
    private int tunjanganMakan, honor;

    /**
     * @return the totalGaji
     */
    public int getTotalGaji() {
        return totalGaji;
    }

    /**
     * @param totalGaji the totalGaji to set
     */
    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    /**
     * @return the jumlahHari
     */
    public int getJumlahHari() {
        return jumlahHari;
    }

    /**
     * @param jumlahHari the jumlahHari to set
     */
    public void setJumlahHari(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    /**
     * @return the tunjanganMakan
     */
    public int getTunjanganMakan() {
        return tunjanganMakan;
    }

    /**
     * @param tunjanganMakan the tunjanganMakan to set
     */
    public void setTunjanganMakan(int tunjanganMakan) {
        this.tunjanganMakan = tunjanganMakan;
    }
    


    /**
     * @return the honor
     */
    public int getHonor() {
        return honor;
    }

    /**
     * @param honor the honor to set
     */
    public void setHonor(int honor) {
        this.honor = honor;
    }
    
    public int getAngkaTotalGaji(int hariKerja) {
        this.setTunjanganMakan(hariKerja * 25000);
        this.setHonor(hariKerja * 120000);
        this.setTotalGaji((this.getHonor() * hariKerja) + (this.getTunjanganMakan() * hariKerja));
    
        return this.getTotalGaji();
    }
    
    @Override
    public void inputPegawaiHonor() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMASUKAN DATA PEGAWAI HONORER");
        System.out.println("=================================================");
        System.out.print("Masukan NAMA Pegawai          : ");
        String nama = input.nextLine();
        System.out.print("Masukan Alamat Pegawai        : ");
        String alamat = input.nextLine();
        System.out.print("Masukan Jumlah Hari Kerja     : ");
        int hariKerja = input.nextInt();

        this.setNama(nama);
        this.setAlamat(alamat);
        this.setJumlahHari(hariKerja);
        int totalGaji = this.getAngkaTotalGaji(this.getJumlahHari());
        
        System.out.println("\nTAMPIL DATA GAJI PEGAWAI HONORER");
        System.out.println("=================================================");
        System.out.println("Nama Pegawai        : " + this.getNama());
        System.out.println("Alamat Pegawai      : " + this.getAlamat());
        System.out.println("Status Pegawai      : HONOR");
        System.out.println("Total Gaji Pegawai  : " + totalGaji);
        
        this.setTotalGaji(totalGaji);
        
        System.out.println("\nRincian Gaji Pegawai");
        System.out.println("Jumlah Hari Kerja Pegawai      : " + this.getJumlahHari());
        System.out.println("Honor           : " + this.getHonor());
        System.out.println("Tunjangan Makan          : " + this.getTunjanganMakan());
    }
}
