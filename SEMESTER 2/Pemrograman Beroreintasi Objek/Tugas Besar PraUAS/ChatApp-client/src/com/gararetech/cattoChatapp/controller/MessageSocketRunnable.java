package com.gararetech.cattoChatapp.controller;

import com.gararetech.cattoChatapp.model.MessageSocketModel;
import com.gararetech.cattoChatapp.model.MessageSocketRunnableModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MessageSocketRunnable implements Runnable {
    private MessageSocketRunnableModel model;
    private Socket socket;
    private BufferedReader input;
    // private PrintWriter output;

    public MessageSocketRunnable(Socket socket) throws IOException {
        this.socket = socket;
        this.input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // this.output = new PrintWriter(socket.getOutputStream(),true);
    }

    @Override
    public void run() {
        try {
            while (true) {
                String response = input.readLine();
                System.out.println(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
