package pratikum15.hanif.pbo.model;

import javax.swing.JOptionPane;
import pratikum15.hanif.pbo.event.PelangganListener;

public class PelangganModel {
    private String nama;
    private String email;
    private String noTelp;
    private String alamat;
    private PelangganListener listener;

    public PelangganListener getListener() {
        return listener;
    }
    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
        this.fireOnChange();
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
        this.fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        this.fireOnChange();
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
        this.fireOnChange();
    }
    
    protected void fireOnChange() {
        if (listener != null) {
            this.listener.onChange(this);
        }
    }
    
    public void simpanFrom() {
        JOptionPane.showMessageDialog(null, "DATA PELANGGAN BERHASIL DISIMPAN");
    }
    
    public void resetFrom() {
        this.setNama("");
        this.setEmail("");
        this.setNoTelp("");
        this.setAlamat("");
    }
}
