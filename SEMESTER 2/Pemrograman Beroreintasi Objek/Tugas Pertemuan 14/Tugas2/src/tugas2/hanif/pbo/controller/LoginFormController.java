package tugas2.hanif.pbo.controller;

import javax.swing.JOptionPane;
import tugas2.hanif.pbo.model.LoginFormModel;
import tugas2.hanif.pbo.view.DashboardView;
import tugas2.hanif.pbo.view.LoginFormView;

public class LoginFormController {
    private LoginFormModel model;

    public LoginFormModel getModel() {
        return model;
    }

    public void setModel(LoginFormModel model) {
        this.model = model;
    }
    
    public void submit(LoginFormView view) {
        String username = view.getTxtUsername1().getText();
        String password = view.getTxtPassword().getText();
        
        String user = "ADMINISTRATOR";
        String pass = "admin123";
        if (username.toUpperCase().equals(user) && password.equals(pass)) {
            JOptionPane.showMessageDialog(view, "LOGIN BERHASIL");
            DashboardView dashboard = new DashboardView();
            dashboard.setVisible(true);
            view.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(view, "USERNAME ATAU PASSWORD SALAH!");
        }
    }
}
