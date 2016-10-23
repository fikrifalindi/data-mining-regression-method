/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package style;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ButtonModel;
import javax.swing.JButton;

/**
 *
 * @author Fikri-Falndi
 */
public class FButton extends JButton {

    public FButton(String text) {
        setText(text);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(false);
        setForeground(Color.white);
        setFont(new Font("Tahoma", Font.BOLD, 14));
        setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        ButtonModel buttonModel = getModel();
        Graphics2D gd = (Graphics2D) g.create();
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gd.setColor(new Color(42, 42, 42));
        if (buttonModel.isRollover()) {
            gd.setColor(new Color(89, 89, 89));
            if (buttonModel.isPressed()) {
                gd.setColor(new Color(42, 42, 42));
            }
        }
        gd.fillRoundRect(0, 0, getWidth(), getHeight(), 8, 8);
        super.paintComponent(g);
    }
}
