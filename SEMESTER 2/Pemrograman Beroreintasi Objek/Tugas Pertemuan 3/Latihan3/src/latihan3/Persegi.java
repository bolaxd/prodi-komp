package latihan3;

/**
 *
 * @author Hanif
 */
public class Persegi {
    int sisiPersegi;
    
    Persegi(int sisi) {
        this.sisiPersegi = sisi;
    }
    
    double luas() {
        return (sisiPersegi * sisiPersegi);
    }
    
    double keliling() {
        return (sisiPersegi * 4);
    }
    
    void tampilJudul() {
        System.out.println();
        System.out.println("Menghitung Keliling dan Luas Persegi");
        System.out.println("====================================");
        System.out.println();
    }
    
    void tampilLuas() {
        System.out.println("Luas Persegi     = " + luas());
    }
    
    void tampilKeliling() {
        System.out.println("keliling Persegi = " + keliling());
    }
}
