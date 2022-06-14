/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai dosen1 = new DosenTetap();
        dosen1.setNama("Chrismikha Hardyanto, S.Kom, M.Kom");
        dosen1.setNip("4217069201");
        dosen1.tampilData();
        
        Pegawai dosen2 = new DosenLayanan();
        dosen2.setNama("Resti Novianti");
        dosen2.tampilData();
        
        Pegawai dosen3 = new DosenTetap();
        dosen3.setNama("Adam Mukharil B");
        dosen3.setNip("4217068601");
        dosen3.tampilData();
    }
    
}
