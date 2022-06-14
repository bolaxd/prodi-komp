package latihan.pkg1;

/**
 *
 * @author 10121161 - Hanif Ahmad Syauqi
 */
public class Main {
    public static void main(String[] args) {
        // Persegi Empat
        int sisiPersegi = 10;
        double kelilingPersegi, luasPersegi;
        
        luasPersegi = sisiPersegi * sisiPersegi;
        kelilingPersegi = sisiPersegi * 4;
        
        System.out.println("Menghitung keliling dan luas persegi");
        System.out.println("====================================\n");
        System.out.println("Keliling Persegi : " + kelilingPersegi);
        System.out.println("Luas Persegi     : " + luasPersegi);


        // Persegi panjang
        int panjangPersegiPanjang, lebarPersegiPanjang;
        double kelilingPersegiPanjang, luasPersegiPanjang;
        
        panjangPersegiPanjang = 10;
        lebarPersegiPanjang = 5;
                
        luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang;
        kelilingPersegiPanjang = 2 * (panjangPersegiPanjang + lebarPersegiPanjang);
        
        System.out.println("\nMenghitung keliling dan luas persegi panjang");
        System.out.println("============================================\n");
        System.out.println("Keliling Persegi Panjang : " + kelilingPersegiPanjang);
        System.out.println("Luas Persegi Panjang     : " + luasPersegiPanjang);
        
        
        // Lingkaran
        int jarijariLingkaran;
        final double PHI = 3.14;
        double kelilingLingkaran, luasLingkaran;
        
        jarijariLingkaran = 7;
        
        kelilingLingkaran = 2 * PHI * jarijariLingkaran;
        luasLingkaran = PHI * (jarijariLingkaran * jarijariLingkaran);
        
        System.out.println("\nMenghitung keliling dan luas lingkaran");
        System.out.println("============================================\n");
        System.out.println("Keliling Lingkaran : " + kelilingLingkaran);
        System.out.println("Luas Lingkaran     : " + luasLingkaran);
    }
    
}