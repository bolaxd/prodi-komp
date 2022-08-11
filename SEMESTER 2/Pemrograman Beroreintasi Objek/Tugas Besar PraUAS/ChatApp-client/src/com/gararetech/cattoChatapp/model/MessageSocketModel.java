package com.gararetech.cattoChatapp.model;

import com.gararetech.cattoChatapp.event.MessageListener;
import java.io.BufferedReader;
import java.net.Socket;

public class MessageSocketModel {
    private String host;
    private int port;
    private MessageListener listener;
    private String response;

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public MessageListener getListener() {
        return listener;
    }
    public void setListener(MessageListener listener) {
        this.listener = listener;
    }
    public String getResponse() {
        return response;
    }
    public void setResponse(String response) {
        this.response = response;
    }
    
    public void onMessage() {
        if (listener != null) {
            this.listener.onMessage(this.getResponse());
        }
    }
}
