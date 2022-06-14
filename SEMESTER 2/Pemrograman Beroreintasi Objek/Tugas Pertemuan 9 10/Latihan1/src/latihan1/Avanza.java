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
public class Avanza extends Mobil {

    public Avanza() {
        super.setNama("Toyota Avanza");
        super.setTahunProduksi("2015");
        super.setWarna("Silver");
    }

    @Override
    public void tampilSpesifikasi() {
        System.out.println("Jenis Mobil     : " + super.getNama());
        System.out.println("Tahun Produksi  : " + super.getTahunProduksi());
        System.out.println("Warna           : " + super.getWarna());

    }

    @Override
    public void start() {
        System.out.println("Menyalakan mobil dengan menggunakan kunci");
    }

    @Override
    public void akselerasi() {
        System.out.println("Mobil melaju dengan kecepatan 70Km/Jam");
    }

}
