
package latihan1;

/**
 *
 * @author Hanif A
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        mhs.urutan = "1";
        mhs.nama = "Hanif Ahmad Syauqi";
        mhs.nim = "10121161";
        mhs.kelas = "IF-4";
        mhs.prodi = "Teknik Informatika";
        mhs.angkatan = "2021";
        mhs.tampilData();
        
        System.out.println();
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.urutan = "2";
        mhs2.nama = "Eri Sukmawan";
        mhs2.nim = "10121139";
        mhs2.kelas = "IF-4";
        mhs2.prodi = "Teknik Informatika";
        mhs2.angkatan = "2021";
        mhs2.tampilData();
    }
}
