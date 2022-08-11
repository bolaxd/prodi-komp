package com.gararetech.cinemas.model;

import com.gararetech.cinemas.view.LoginView;
import com.gararetech.cinemas.view.SplashScreenView;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

public class SplashScreenModel {
    private LoginView loginPage;
    private SplashScreenView splashView;

    public LoginView getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(LoginView loginPage) {
        this.loginPage = loginPage;
    }

    public SplashScreenView getSplashView() {
        return splashView;
    }

    public void setSplashView(SplashScreenView splashView) {
        this.splashView = splashView;
    }
    
    
}
