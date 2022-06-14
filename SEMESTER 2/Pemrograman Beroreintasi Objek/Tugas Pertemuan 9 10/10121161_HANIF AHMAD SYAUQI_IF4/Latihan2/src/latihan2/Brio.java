/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author LAB05
 */
public class Brio implements Mobil {

    private String nama, tahunProduksi, warna;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(String tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Brio() {
        this.setNama("Honda Brio Extender GT-3000");
        this.setTahunProduksi("2022");
        this.setWarna("Merah Maroon");
    }

    @Override
    public void tampilSpesifikasi() {
        System.out.println("Jenis Mobil     : " + this.getNama());
        System.out.println("Tahun Produksi  : " + this.getTahunProduksi());
        System.out.println("Warna           : " + this.getWarna());

    }

    @Override
    public void start() {
        System.out.println("Menyalakan mobil dengan menggunakan tombol Start Engine");
    }

    @Override
    public void akselerasi() {
        System.out.println("Mobil melaju dengan kecepatan 520Km/Jam");
    }

}
