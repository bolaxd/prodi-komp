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
public class Age {
    private int tahunLahir, tahunSkrg;
    private String keterangan;

    Age(int tahunSkrng) {
        this.tahunSkrg = tahunSkrng;
    }
    /**
     * @return the tahunLahir
     */
    public int getTahunLahir() {
        return tahunLahir;
    }

    /**
     * @param tahunLahir the tahunLahir to set
     */
    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    /**
     * @return the tahunSkrg
     */
    public int getTahunSkrg() {
        return tahunSkrg;
    }
    
        /**
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
   
    public int hitungUmur() {
        return (this.getTahunSkrg() - this.getTahunLahir());
    }
    
    public String tandanyaKamu(int umur) {
        if (0 <= umur && 5 >= umur ) {
            this.setKeterangan("LAGI LUCU-LUCU NYA");
        } else if (5 < umur && 10 >= umur) {
            this.setKeterangan("MASIH ANAK=ANAK");
        } else if (10 < umur && 13 >= umur) {
            this.setKeterangan("MASIH REMADJA");
        } else if (13 < umur && 19 >= umur) {
            this.setKeterangan("ALAY");
        } else if (19 < umur && 29 >= umur) {
            this.setKeterangan("LAGI GALAU NYARI JODOH");
        } else if (29 < umur && 35 >= umur) {
            this.setKeterangan("LAGI SIBUK NYARI UANG");
        } else if (35 < umur && 150 >= umur) {
            this.setKeterangan("SUDAH TUA");
        } else {
            this.setKeterangan("TIDAK TERDETEKSI DI KEHIDUPAN");
        }

        return this.getKeterangan();
    }


}
