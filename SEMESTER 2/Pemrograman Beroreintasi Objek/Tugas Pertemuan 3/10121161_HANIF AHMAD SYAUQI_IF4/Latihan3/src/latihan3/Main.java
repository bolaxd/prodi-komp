package latihan3;

/**
 *
 * @author Hanif
 */
public class Main {

    public static void main(String[] args) {
        Persegi bangun1 = new Persegi(10);
        bangun1.tampilJudul();
        bangun1.tampilKeliling();
        bangun1.tampilLuas();
        
        PersegiPanjang bangun2 = new PersegiPanjang(10, 5);
        bangun2.tampilJudul();
        bangun2.tampilKeliling();
        bangun2.tampilLuas();
        
        Lingkaran bangun3 = new Lingkaran(7);
        bangun3.tampilJudul();
        bangun3.tampilKeliling();
        bangun3.tampilLuas();
    }
    
}
