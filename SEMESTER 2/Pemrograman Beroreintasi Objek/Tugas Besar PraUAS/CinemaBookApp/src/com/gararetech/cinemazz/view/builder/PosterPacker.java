package com.gararetech.cinemas.view.builder;

import com.gararetech.cinemas.utils.ScaleImage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PosterPacker {
    private String horizontalGrid;
    private String verticalGrid;
    private String posterPath;
    private JPanel contentPane;
    
    public PosterPacker(String posterPath, JPanel contentPane) {
        this.posterPath = posterPath;
        this.contentPane = contentPane;
    }
    
    public String getHorizontalGrid() {
        return horizontalGrid;
    }
    public void setHorizontalGrid(String horizontalGrid) {
        this.horizontalGrid = horizontalGrid;
    }
    public String getVerticalGrid() {
        return verticalGrid;
    }
    public void setVerticalGrid(String verticalGrid) {
        this.verticalGrid = verticalGrid;
    }
    public String getPosterPath() {
        return posterPath;
    }
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }
    public JPanel getContentPane() {
        return contentPane;
    }
    public void setContentPane(JPanel contentPane) {
        this.contentPane = contentPane;
    }
    
    public void setGrid() {
        JPanel gridPane = new JPanel(new GridLayout(0, 3));
//        JLabel posterImage = new JLabel();
//        posterImage.setPreferredSize(new Dimension(220, 323));
//        ImageIcon posterIcon = new ImageIcon(getClass().getResource(this.getPosterPath()));
//        ScaleImage scaleImg = new ScaleImage(posterIcon, 220, 323);
//        ImageIcon resizePoster = scaleImg.scaleImage();
//        posterImage.setIcon(resizePoster);
//        gridPane.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
//        gridPane.add(posterImage);
        
        for (int i =0; i<(10*10); i++){
            final JPanel panel = new JPanel();
            panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panel.setPreferredSize(new Dimension(250, 600));
            gridPane.add(panel);
        }
        this.getContentPane().add(gridPane);
    }
}
