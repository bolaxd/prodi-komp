package tugas2.hanif.pbo.model;

import tugas2.hanif.pbo.event.LoginFormListener;
import tugas2.hanif.pbo.view.DashboardView;
import tugas2.hanif.pbo.view.LoginFormView;

public class LoginFormModel {
    private String username;
    private String password;
    private DashboardView dashboard;
    private LoginFormListener listener;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        this.onChange();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        this.onChange();
    }

    public DashboardView getDashboard() {
        return dashboard;
    }

    public void setDashboard(DashboardView dashboard) {
        this.dashboard = dashboard;
        this.onChange();
    }

    public LoginFormListener getListener() {
        return listener;
    }

    public void setListener(LoginFormListener listener) {
        this.listener = listener;
    }
    
    protected void onChange() {
        if (listener != null) {
            this.listener.onChange(this);
        }
    }
    
    public void submit(LoginFormView view) {
        view.setVisible(false);
    }
}
