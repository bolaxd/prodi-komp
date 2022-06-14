package pratikum2;

public class ButtonSimpan implements Button, Event {

    private String sumbuY, sumbuX, label, warna;

    public ButtonSimpan() {
        this.createButton();
    }

    public String getSumbuY() {
        return sumbuY;
    }

    public void setSumbuY(String sumbuY) {
        this.sumbuY = sumbuY;
    }

    public String getSumbuX() {
        return sumbuX;
    }

    public void setSumbuX(String sumbuX) {
        this.sumbuX = sumbuX;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void createButton() {
        this.sumbuX = "75";
        this.sumbuY = "40";
        this.label = "Tombol Simpan";
        this.warna = "merah";
    }

    @Override
    public void viewButton() {
        System.out.println("Nama Button     : " + this.label);
        System.out.println("Panjang Button  : " + this.sumbuX);
        System.out.println("Lebar Button    : " + this.sumbuY);
        System.out.println("Warna Button    : " + this.warna);
    }

    @Override
    public void mouseClick() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
