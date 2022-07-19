package pratikum15.hanif.pbo.controller;

import javax.swing.JOptionPane;
import pratikum15.hanif.pbo.model.PelangganModel;
import pratikum15.hanif.pbo.view.PelangganView;

public class PelangganController {
    private PelangganModel model;

    public PelangganModel getModel() {
        return model;
    }
    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void simpanForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        String alamat = view.getTxtAlamat().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Field Nama tidak boleh kosong!");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Field Email tidak boleh kosong!");
        } else if (noTelp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Field No Telepon tidak boleh kosong!");
        } else if (alamat.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Field Alamat tidak boleh kosong!");
        } else {
            model.simpanFrom();
            model.resetFrom();
        }
    }
    
    public void resetForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        String alamat = view.getTxtAlamat().getText();  
        
        if (nama.equals("") && email.equals("") && noTelp.equals("") && alamat.equals("")) {
                JOptionPane.showMessageDialog(view, "Form masih kosong");
        } else {
            model.resetFrom();
        }
    }
    
}
