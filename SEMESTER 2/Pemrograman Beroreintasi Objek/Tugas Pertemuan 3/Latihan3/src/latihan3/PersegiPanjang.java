package latihan3;

/**
 *
 * @author Hanif
 */
public class PersegiPanjang {
    int panjang, lebar;

    PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    double luas() {
        return (panjang * lebar);
    }
    
    double keliling() {
        return (2 * (panjang + lebar));
    }
    
    void tampilJudul() {
        System.out.println();
        System.out.println("Menghitung Keliling dan Luas Persegi Panjang");
        System.out.println("============================================");
        System.out.println();
    }
    
    void tampilLuas() {
        System.out.println("Luas Persegi Panjang     = " + luas());
    }
    
    void tampilKeliling() {
        System.out.println("keliling Persegi Panjang = " + keliling());
    }
    
}
