package com.gararetech.cattoChatapp.model;

import java.io.BufferedReader;
import java.net.Socket;

public class MessageSocketRunnableModel {
    private Socket socket;
    private BufferedReader input;

    public Socket getSocket() {
        return socket;
    }
    public void setSocket(Socket socket) {
        this.socket = socket;
    }
    public BufferedReader getInput() {
        return input;
    }
    public void setInput(BufferedReader input) {
        this.input = input;
    }
    
    
}
