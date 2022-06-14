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
public class Pengemudi {

    private Mobil mobil;

    public Pengemudi(Mobil mobil) {
        this.mobil = mobil;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public void melihatSpesifikasi() {
        this.mobil.tampilSpesifikasi();
    }

    public void menyalakanMobil() {
        this.mobil.start();
    }

    public void menginjakGas() {
        this.mobil.akselerasi();
    }
}
