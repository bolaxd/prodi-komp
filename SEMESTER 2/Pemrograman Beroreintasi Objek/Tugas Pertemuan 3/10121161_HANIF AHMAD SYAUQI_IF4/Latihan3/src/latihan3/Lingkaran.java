package latihan3;

/**
 *
 * @author user
 */
public class Lingkaran {
    int jarijari;
    final double PHI = 3.14;
    
    Lingkaran(int jarijari) {
        this.jarijari = jarijari;
    }
    
    double luas() {
        return (PHI * (jarijari * jarijari));
    }
    
    double keliling() {
        return (2 * PHI * jarijari);
    }
    
    void tampilJudul() {
        System.out.println();
        System.out.println("Menghitung Keliling dan Luas Lingkaran");
        System.out.println("======================================");
        System.out.println();
    }
    
    void tampilLuas() {
        System.out.println("Luas Lingkaran     = " + luas());
    }
    
    void tampilKeliling() {
        System.out.println("keliling Lingkaran = " + keliling());
    }
}
