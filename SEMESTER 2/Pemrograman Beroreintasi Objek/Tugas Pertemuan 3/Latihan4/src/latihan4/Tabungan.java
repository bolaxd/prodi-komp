package latihan4;

/**
 *
 * @author Hanif
 */
public class Tabungan {
    int saldoAwal, saldoTarget;
    final double bunga = 0.10;
    
    Tabungan(int saldoAwal, int saldoTarget) {
        this.saldoAwal = saldoAwal;
        this.saldoTarget = saldoTarget;
    }
    
    void tampilJudul() {
        System.out.println("Tampil Stimulasi Tabungan");
        System.out.println("=========================");
        System.out.println("");
    }
    
    void tampilHasil() {
        int counter = 0;
        int saldo = saldoAwal;
        while (saldo < saldoTarget) {            
            double saldoBunga = saldo * bunga;
            saldo += saldoBunga;
            counter++;
            System.out.println("Saldo di bulan ke-" + counter + " : Rp. " + saldo);
        }
    }
}
