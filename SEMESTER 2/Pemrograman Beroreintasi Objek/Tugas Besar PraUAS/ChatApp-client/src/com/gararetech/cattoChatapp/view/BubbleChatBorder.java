//Reference : https://stackoverflow.com/questions/15025092/border-with-rounded-corners-transparency
package com.gararetech.cattoChatapp.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.Border;

public class BubbleChatBorder implements Border {

    private Color color = null;
    private int radius;

    
    public BubbleChatBorder(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g.create();
        RoundRectangle2D roundBorder = new RoundRectangle2D.Double(x, y, width - 1, height - 1, getRadius(), getRadius());
        g2d.draw(roundBorder);
        g2d.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        int value = getRadius() / 2;
        return new Insets(value, value, value, value);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
