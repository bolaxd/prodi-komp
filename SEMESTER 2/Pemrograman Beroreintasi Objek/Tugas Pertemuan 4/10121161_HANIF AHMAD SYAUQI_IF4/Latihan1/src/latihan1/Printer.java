/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author LAB05
 */
public class Printer {

    private String nama;
    private int jumlahCetak;

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
     * @return the jumlahCetak
     */
    public int getJumlahCetak() {
        return jumlahCetak;
    }

    /**
     * @param jumlahCetak the jumlahCetak to set
     */
    public void setJumlahCetak(int jumlahCetak) {
        this.jumlahCetak = jumlahCetak;
    }

    public void cetakDalamJumlah() {
        for (int i = 0; i < this.jumlahCetak; i++) {
            System.out.println(i + 1 + ". " + this.nama);
        }
    }
}
