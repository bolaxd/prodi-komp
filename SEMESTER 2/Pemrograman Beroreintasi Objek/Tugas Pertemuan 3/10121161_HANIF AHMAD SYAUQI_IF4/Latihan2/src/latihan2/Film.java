package latihan2;

/**
 *
 * @author user
 */
public class Film {
    String nama, genre, rating, durasi;
     
    Film(String nama) {
        this.nama = nama;
    }
    
    void showTitle() {
        System.out.println("Daftar Film yang Sedang Tayang di UNIKOM TV");
        System.out.println("-------------------------------------------");
    }
    
    void newLine() {
        System.out.println();
    }
    
    void tampilData() {
        System.out.println("Nama Film   : " + this.nama);
        System.out.println("Genre Film  : " + this.genre);
        System.out.println("Rating Film : " + this.rating);
        System.out.println("Durasi      : " + this.durasi);
    }
}
