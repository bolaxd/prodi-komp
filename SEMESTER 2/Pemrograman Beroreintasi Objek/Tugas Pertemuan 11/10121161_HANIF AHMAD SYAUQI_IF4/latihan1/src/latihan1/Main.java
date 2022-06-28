package latihan1;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai();
        try {
            nilai.tambahNilai();
            nilai.tampilNilai();
        } catch (ValidateInputException e) {
            System.out.println(e);
        } catch (ValidateScoreException e) {
            System.out.println(e);
        }
    }
    
}
