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
public class PegawaiTetap extends Pegawai {
    private String nip;
    private int lamaKerja, jumlahAnak;
    
    private int gajiPokok;
    private int tunjanganAnak;
    private int tunjanganTransportasi = 370000;
    private int totalGaji;
    
    public PegawaiTetap() {
        
    }

    /**
     * @return the nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /**
     * @return the lamaKerja
     */
    public int getLamaKerja() {
        return lamaKerja;
    }

    /**
     * @param lamaKerja the lamaKerja to set
     */
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    /**
     * @return the jumlahAnak
     */
    public int getJumlahAnak() {
        return jumlahAnak;
    }

    /**
     * @param jumlahAnak the jumlahAnak to set
     */
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    /**
     * @return the gajiPokok
     */
    public int getGajiPokok() {
        return gajiPokok;
    }

    /**
     * @param gajiPokok the gajiPokok to set
     */
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    /**
     * @return the tunjanganAnak
     */
    public int getTunjanganAnak() {
        return tunjanganAnak;
    }

    /**
     * @param tunjanganAnak the tunjanganAnak to set
     */
    public void setTunjanganAnak(int tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    /**
     * @return the tunjanganTransportasi
     */
    public int getTunjanganTransportasi() {
        return tunjanganTransportasi;
    }

    /**
     * @param tunjanganTransportasi the tunjanganTransportasi to set
     */
    public void setTunjanganTransportasi(int tunjanganTransportasi) {
        this.tunjanganTransportasi = tunjanganTransportasi;
    }

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
    
    public int getAngkaGajiPokok(int lamaKerja) {
        int angka = 0;
        
        if (lamaKerja <= 5) {
            angka = 2500000;
        } else if (lamaKerja <= 10) {
            angka = 4700000;
        } else if (lamaKerja <= 20) {
            angka = 6500000;
        } else if (lamaKerja > 20) {
            angka = 10000000;
        }
        
        return angka;
    }
    
    public int getAngkaTunjanganAnak(int jumlahAnak) {
        return jumlahAnak * 400000;
    }
    
    public int getAngkaTotalGaji(int lamaKerja, int jumlahAnak) {
        gajiPokok = this.getAngkaGajiPokok(lamaKerja);
        this.setGajiPokok(gajiPokok);
        tunjanganAnak = this.getAngkaTunjanganAnak(jumlahAnak);
        this.setTunjanganAnak(tunjanganAnak);
        return this.getGajiPokok() * this.getTunjanganAnak()* this.getTunjanganTransportasi();
    }
  
    @Override
    public void inputPegawaiTetap() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMASUKAN DATA PEGAWAI TETAP");
        System.out.println("=================================================");
        System.out.print("Masukan NIP Pegawai           : ");
        String nip = input.nextLine();
        System.out.print("Masukan NAMA Pegawai          : ");
        String nama = input.nextLine();
        System.out.print("Masukan Alamat Pegawai        : ");
        String alamat = input.nextLine();
        System.out.print("Masukan Lama Kerja Pegawai    : ");
        int lamaKerja = input.nextInt();
        System.out.print("Masukan Jumlah Anak           : ");
        int jumlahAnak = input.nextInt();

        this.setNip(nip);
        this.setNama(nama);
        this.setAlamat(alamat);
        this.setLamaKerja(lamaKerja);
        this.setJumlahAnak(jumlahAnak);
        int totalGaji = this.getAngkaTotalGaji(lamaKerja, jumlahAnak);
        this.setTotalGaji(totalGaji);
        
        System.out.println("\nTAMPIL DATA GAHI PEGAWAI TETAP");
        System.out.println("=================================================");
        System.out.println("NIP Pegawai         : " + this.getNip());
        System.out.println("Nama Pegawai        : " + this.getNama());
        System.out.println("Alamat Pegawai      : " + this.getAlamat());
        System.out.println("Status Pegawai      : TETAP");
        System.out.println("Total Gaji Pegawai  : " + this.getTotalGaji());
        
       
        
        System.out.println("\nRincian Gaji Pegawai");
        System.out.println("Lama Kerja Pegawai      : " + this.getLamaKerja());
        System.out.println("Jumlah Anak             : " + this.getJumlahAnak());
        System.out.println("Gaji Pokok Pegawai      : " + this.getGajiPokok());
        System.out.println("Tunjangan Anak          : " + this.getTunjanganAnak());
        System.out.println("Tunjangan Transportasi  : " + this.getTunjanganTransportasi());
    }
}
