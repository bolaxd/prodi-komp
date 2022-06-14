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
public class Pegawai {
    private String nama, alamat;
    private String statusPegawai;
    public Pegawai() {}

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the statusPegawai
     */
    public String getStatusPegawai() {
        return statusPegawai;
    }

    /**
     * @param statusPegawai the statusPegawai to set
     */
    public void setStatusPegawai(String statusPegawai) {
        this.statusPegawai = statusPegawai;
    }
    
    public void tampilJudul() {
        System.out.println("PROGRAM MENGHITUNG GAJI PEGAWAI PT.CENAT-CENUT");
        System.out.println("=================================================");
    }
    
    public String inputStatusPegawai() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Status Pegawai [TETAP/HONOR] : ");
        String opsi = input.nextLine();
        return opsi;
    }
    
    public void inputPegawaiTetap() {
    
    }
    
    public void inputPegawaiHonor() {
    
    }    
    
}
