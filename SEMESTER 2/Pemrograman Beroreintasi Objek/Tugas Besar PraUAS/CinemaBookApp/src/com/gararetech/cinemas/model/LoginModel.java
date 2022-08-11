package com.gararetech.cinemas.model;

import java.net.HttpURLConnection;

public class LoginModel {
    final private String tixBaseUrl = "https://api.tix.id/v1";
    final private String tokenEndpoint = "/token";
    private HttpURLConnection connection;
    private String token;

    public String getTixBaseUrl() {
        return tixBaseUrl;
    }

    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    public HttpURLConnection getConnection() {
        return connection;
    }

    public void setConnection(HttpURLConnection connection) {
        this.connection = connection;
    }
    
    
    
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
}
