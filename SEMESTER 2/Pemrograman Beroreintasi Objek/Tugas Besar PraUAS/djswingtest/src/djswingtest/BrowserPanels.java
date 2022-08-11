/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package djswingtest;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationParameters;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author user
 */
public class BrowserPanels {
    public BrowserPanels() {
    }
    
    public void create(int width, int height) {
        NativeInterface.open();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("YouTube Viewer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(getBrowserPanel(width, height));
                frame.setSize(width, height);
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
            }
        });
        NativeInterface.runEventPump();
        // don't forget to properly close native components
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                NativeInterface.close();
            }
        }));
    }

    public JPanel getBrowserPanel(int width, int height) {
        JPanel webBrowserPanel = new JPanel();
        webBrowserPanel.setLayout(null);
        JWebBrowser webBrowser = new JWebBrowser();
        webBrowser.setBounds(0, 0, width+250, height);
        webBrowser.setBarsVisible(false);
        webBrowser.useXULRunnerRuntime();
        
        String url = "file:///E:/Data/HtmlProject/maps.html";//"file:///E:/Data/HtmlProject/videoplayer.html";
        
//        webBrowser.navigate();
        webBrowser.navigate(url);
        
        
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        return webBrowserPanel;
    }
}
