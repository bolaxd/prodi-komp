/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author user
 */
public class Mahasiswa {
    private final String prodi;
    private final int urutan;
    private String nama, nim, kelas;
    private Nilai nilaiMahasiswa;
    
    Mahasiswa(int urutan, String programStudi) {
        this.nilaiMahasiswa = new Nilai();
        this.prodi = programStudi;
        this.urutan = urutan;
    }

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
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * @return the kelas
     */
    public String getKelas() {
        return kelas;
    }

    /**
     * @param kelas the kelas to set
     */
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    /**
     * @return the nilaiMahasiswa
     */
    public Nilai getNilaiMahasiswa() {
        return nilaiMahasiswa;
    }

    /**
     * @return the prodi
     */
    public String getProdi() {
        return prodi;
    }

    /**
     * @return the urutan
     */
    public int getUrutan() {
        return urutan;
    }
    
    public int setTugas(int nilai) {
        this.getNilaiMahasiswa().setTugas(nilai);
        return nilai;
    }
    
    public int setUts(int nilai) {
        this.getNilaiMahasiswa().setUts(nilai);
        return nilai;
    }
    
    public int setUas(int nilai) {
        this.getNilaiMahasiswa().setUas(nilai);
        return nilai;
    }
    
    public void tampilData() {
        String nama = this.getNama();
        String nim = this.getNim();
        String prodi = this.getProdi();
        String kelas = this.getKelas();
        int tugas = this.getNilaiMahasiswa().getTugas();
        int uas = this.getNilaiMahasiswa().getUas();
        int uts = this.getNilaiMahasiswa().getUts();
        double nilaiAkhir = this.getNilaiMahasiswa().nilaiAkhir();
        char indexNilai = this.getNilaiMahasiswa().indexNilai();
        
        System.out.println("Data Nilai Mahasiswa ke-" + this.getUrutan());
        System.out.println("Nama Mahasiswa      : " + nama);
        System.out.println("NIM Mahasiswa       : " + nim);
        System.out.println("Kelas               : " + kelas);
        System.out.println("Program Studi       : " + prodi);
        System.out.println("Nilai Tugas         : " + tugas);
        System.out.println("Nilai UTS           : " + uts);
        System.out.println("Nilai UAS           : " + uas);
        System.out.println("Tampil Nilai Akhir  : " + nilaiAkhir);
        System.out.println("Tampil Indeks Nilai : " + indexNilai);
    }

    
        
}
