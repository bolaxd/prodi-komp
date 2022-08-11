package com.gararetech.cinemas.controller;

import com.gararetech.cinemas.model.LoginModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginController {
    private LoginModel model;

    public LoginModel getModel() {
        return model;
    }

    public void setModel(LoginModel model) {
        this.model = model;
    }
    
    public void getToken(){
        try {
            URL tokenUrl = new URL (model.getTixBaseUrl() + model.getTokenEndpoint());
            
            model.setConnection((HttpURLConnection) tokenUrl.openConnection());
            model.getConnection().setRequestMethod("POST");
            model.getConnection().setRequestProperty("Content-Type", "application/json");
            model.getConnection().setRequestProperty("Client-Secret", "123456");
            model.getConnection().setConnectTimeout(5000);
            model.getConnection().setReadTimeout(5000);
            
            BufferedReader reader;
            String line;
            StringBuffer responseContent = new StringBuffer();
            int status = model.getConnection().getResponseCode();
            
            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(model.getConnection().getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(model.getConnection().getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
            System.out.println(responseContent.toString());
        } catch (MalformedURLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
