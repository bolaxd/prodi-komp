package latihan1;

/**
 *
 * @author Hanif
 */
public class Mahasiswa {
    String nama, nim, 
           kelas, angkatan,
           prodi, urutan;
    
    final String universitas = "UNIKOM";
    
    void tampilData() {
        System.out.println("Tampil Data Mahasiswa ke-" + urutan);
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.println("NIM Mahasiswa   : " + nim);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Program Studi   : " + prodi);
        System.out.println("Angkatan        : " + angkatan);
        System.out.println("Universitas     : " + universitas);
    }
}
