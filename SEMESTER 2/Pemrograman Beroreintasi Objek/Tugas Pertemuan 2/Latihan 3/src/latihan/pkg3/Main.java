package latihan.pkg3;

/**
 *
 * @author 10121161 - Hanif Ahmad Syauqi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldoAwal   = 1000000;
        double bunga    = 0.10;     // 10% per bulan
        int saldoTarget = 2000000;
               
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
