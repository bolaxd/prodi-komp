package pratikum3.hanif.pbo.main;

public class Kalkulator {
    private int bilangan1, bilangan2;

    public int getBilangan1() {
        return bilangan1;
    }

    public void setBilangan1(int bilangan1) {
        this.bilangan1 = bilangan1;
    }

    public int getBilangan2() {
        return bilangan2;
    }

    public void setBilangan2(int bilangan2) {
        this.bilangan2 = bilangan2;
    }
    
    public void tampilKalkulasi(Main calc) {
        try {
            this.setBilangan1(Integer.valueOf(calc.getTxtBilangan1().getText()));
            this.setBilangan2(Integer.valueOf(calc.getTxtBilangan2().getText()));

            int operator = calc.getCmbOperasi().getSelectedIndex();
        
            switch (operator) {
                case 0: // PENJUMLAHAN
                    int hasilJumlah = this.getBilangan1() + this.getBilangan2();
                    calc.getTxtHasil().setText(String.valueOf(hasilJumlah));
                break;
                case 1: // PENGURANGAN
                    int hasilKurang = this.getBilangan1() - this.getBilangan2();
                    calc.getTxtHasil().setText(String.valueOf(hasilKurang));
                break;
                case 2: // PERKALIAN
                    int hasilKali = this.getBilangan1() * this.getBilangan2();
                    calc.getTxtHasil().setText(String.valueOf(hasilKali));
                break;
                case 3: // PEMBAGIAN
                    double hasilBagi = this.getBilangan1() / this.getBilangan2();
                    calc.getTxtHasil().setText(String.valueOf(hasilBagi));
                break;
            }
        } catch (Exception e) {
            calc.getTxtHasil().setText(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
    
    public void clearTampilan(Main calc) {
        calc.getTxtBilangan1().setText("");
        calc.getTxtBilangan2().setText("");
        calc.getCmbOperasi().setSelectedIndex(0);
        calc.getTxtHasil().setText("");
    }
}
