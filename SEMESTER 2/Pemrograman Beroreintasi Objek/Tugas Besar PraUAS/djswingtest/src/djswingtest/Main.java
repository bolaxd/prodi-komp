/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package djswingtest;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        BrowserPanels browserPanel = new BrowserPanels();
        browserPanel.create(800, 500);
    }
}
