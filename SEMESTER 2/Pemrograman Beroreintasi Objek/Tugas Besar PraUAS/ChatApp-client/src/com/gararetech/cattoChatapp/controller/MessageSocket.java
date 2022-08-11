package com.gararetech.cattoChatapp.controller;

import com.gararetech.cattoChatapp.model.MessageSocketModel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class MessageSocket {
    private MessageSocketModel model;
    private WebsocketClientEndpoint clientEndPoint;

    public MessageSocketModel getModel() {
        return model;
    }
    public void setModel(MessageSocketModel model) {
        this.model = model;
    }

    public WebsocketClientEndpoint getClientEndPoint() {
        return clientEndPoint;
    }

    public void connectToServer() {
         try {
            // open websocket
            clientEndPoint = new WebsocketClientEndpoint(new URI("wss://demo.piesocket.com/v3/channel_1?api_key=VCXCEuvhGcBDP7XhiJJUDvR1e1D3eiVjgZ9VRiaV"));

            // add listener
            clientEndPoint.addMessageHandler(new WebsocketClientEndpoint.MessageHandler() {
                public void handleMessage(String message) {
//                    HANDLE MESSAGE
//                    System.out.println("Handle :" + message);
//                    model.setResponse(message);
//                    model.onMessage();
                }
            });

            // send message to websocket
            clientEndPoint.sendMessage("{'event':'addChannel','channel':'ok_btccny_ticker'}");

            // wait 5 seconds for messages from websocket
//            Thread.sleep(5000);

//        } catch (InterruptedException ex) {
//            System.err.println("InterruptedException exception: " + ex.getMessage());
        } catch (URISyntaxException ex) {
            System.err.println("URISyntaxException exception: " + ex.getMessage());
        }
//        try ( Socket socket = new Socket(model.getHost(), model.getPort())) {
//            //reading the input from server
//            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//
//            //returning the output to the server : true statement is to flush the buffer otherwise
//            //we have to do it manuallyy
//            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
//
//            //taking the user input
//            Scanner scanner = new Scanner(System.in);
//            String userInput;
//            String response;
//            String clientName = "empty";
//
//            MessageSocketRunnable clientRun = new MessageSocketRunnable(socket);
//
//            new Thread(clientRun).start();
//            //loop closes when user enters exit command
//
//            do {
//
//                if (clientName.equals("empty")) {
//                    System.out.println("Enter your name ");
//                    userInput = scanner.nextLine();
//                    clientName = userInput;
//                    output.println(userInput);
//                    if (userInput.equals("exit")) {
//                        break;
//                    }
//                } else {
//                    String message = ("(" + clientName + ")" + " message : ");
//                    System.out.println(message);
//                    userInput = scanner.nextLine();
//                    output.println(message + " " + userInput);
//                    if (userInput.equals("exit")) {
//                        //reading the input from server
//                        break;
//                    }
//                }
//
//            } while (!userInput.equals("exit"));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
