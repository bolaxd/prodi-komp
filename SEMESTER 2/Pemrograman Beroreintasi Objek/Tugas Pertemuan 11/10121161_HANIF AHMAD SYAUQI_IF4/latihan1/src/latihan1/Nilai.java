package latihan1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nilai {

    private int nilai;

    /**
     * @return the nilai
     */
    public int getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public void tambahNilai() throws ValidateInputException {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan Nilai (Wajib direntang 0 - 100)   : ");
            this.setNilai(input.nextInt());
        } catch (InputMismatchException e) {
            String msg = "Bilangan harus bernilai INTEGER";
            throw new ValidateInputException(msg);
        }
    }

    public void tampilNilai() throws ValidateScoreException {
        int nilai_ = this.getNilai();
        if (nilai_ > 100 || nilai_ < 0) {
            String msg = "Nilai Tidak Direntang 0 s/d 100";
            throw new ValidateScoreException(msg);
        }
    }
}
