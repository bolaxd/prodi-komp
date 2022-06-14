/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1;

import java.util.Scanner;

/**
 *
 * @author Hanif
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void tarikSaldo(int JumlahPenarikan) {
        if (this.getSaldo() < JumlahPenarikan) {
            System.out.println("-SALDO TIDAK MENCUKUPI-");
        } else {
            this.setSaldo(this.getSaldo() - JumlahPenarikan);
            System.out.println("-PENARIKAN TABUNGAN BERHASIL-");
            System.out.println("Jumlah Saldo Saat Ini    : Rp." + this.getSaldo());
        }
    }
    
    public void tampilJudul() {
        System.out.println("APLIKASI PENARIKAN TABUNGAN");
        System.out.println("===========================");
        System.out.println("Saldo Awal Tabungan Anda : " + this.getSaldo());
    }
       
    public void mulaiPenarikan() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Apakah Anda mau menarik Saldo Tabungan Anda ?");
        System.out.print("[Y/T] : ");
        String opsi = input.nextLine();
        if (opsi.toUpperCase().equals("Y")) {
            System.out.print("Masukan jumlah Penarikan : Rp.");
            int jumlahPenarikan = input.nextInt();
            this.tarikSaldo(jumlahPenarikan);
            this.mulaiPenarikan();
        } else if (opsi.toUpperCase().equals("T")) {
            System.exit(0);
        } else {
            System.out.println("Opsi salah!");
            this.mulaiPenarikan();
        }
    }
}
