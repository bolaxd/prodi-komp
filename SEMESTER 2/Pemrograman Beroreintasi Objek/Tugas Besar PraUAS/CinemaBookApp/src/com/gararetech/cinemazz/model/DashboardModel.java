/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gararetech.cinemas.model;

/**
 *
 * @author user
 */
public class DashboardModel {
    final private String tixBaseUrl = "https://api.tix.id/v1";
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
