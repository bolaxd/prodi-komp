/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1ganjil;

/**
 *
 * @author Hanif Ahmad Syauqi
 * @nim 10121161
 * @kelas IF4 2021
 */
public class Hanif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai app = new Pegawai();
        app.tampilJudul();
        String opsi = app.inputStatusPegawai();
        if (opsi.toUpperCase().equals("TETAP")) {
            Pegawai pegawaiTetap = new PegawaiTetap();
            pegawaiTetap.inputPegawaiTetap();
        } else if (opsi.toUpperCase().equals("HONOR")) {
            Pegawai pegawaiHonor = new PegawaiHonor();
            pegawaiHonor.inputPegawaiHonor();
        } else {
            System.out.println("Opsi Salah!");
        }
    }
    
}
