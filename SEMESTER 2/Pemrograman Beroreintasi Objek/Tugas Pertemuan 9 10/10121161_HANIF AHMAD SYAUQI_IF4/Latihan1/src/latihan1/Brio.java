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
public class Brio extends Mobil {

    public Brio() {
        super.setNama("Honda Brio Extender GT-3000");
        super.setTahunProduksi("2022");
        super.setWarna("Merah Maroon");
    }

    @Override
    public void tampilSpesifikasi() {
        System.out.println("Jenis Mobil     : " + super.getNama());
        System.out.println("Tahun Produksi  : " + super.getTahunProduksi());
        System.out.println("Warna           : " + super.getWarna());

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
