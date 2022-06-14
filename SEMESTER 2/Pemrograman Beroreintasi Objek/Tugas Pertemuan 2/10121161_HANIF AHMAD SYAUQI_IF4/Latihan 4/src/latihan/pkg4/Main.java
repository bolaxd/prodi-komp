package latihan.pkg4;

/**
 *
 * @author 10121161 - Hanif Ahmad Syauqi
 */
public class Main {
    public static void main(String[] args) {
        int nilaiKehadiran  = 100;
        int nilaiTugas      = 80;
        int nilaiUTS        = 60;
        int nilaiUAS        = 75;
        
        double nilaiAkhir = (nilaiKehadiran * 0.15) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.40);
        
        System.out.println("Masukan Nilai Kehadiran         : " + nilaiKehadiran);
        System.out.println("Masukan Nilai Tugas             : " + nilaiTugas);
        System.out.println("Masukan Nilai UTS               : " + nilaiUTS);
        System.out.println("Masukan Nilai UAS               : " + nilaiUAS);        
        System.out.println("-----------------------------------------------");
        System.out.println("Nilai Akhir Anda                : " + nilaiAkhir);        

        char indeks;
        if (nilaiAkhir >= 80) {
            indeks = 'A';
        } else if (nilaiAkhir >= 68 && nilaiAkhir < 80) {
            indeks = '8';
        } else if (nilaiAkhir >= 45 && nilaiAkhir < 68) {
            indeks = 'C';
        } else if (nilaiAkhir >= 30 && nilaiAkhir < 45) {
            indeks = 'D';
        } else {
            indeks = 'E';
        }
        
        System.out.println("Indeks Nilai Anda               : " + indeks);        

    }
    
}
