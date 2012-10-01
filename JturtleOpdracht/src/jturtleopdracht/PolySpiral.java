/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jturtleopdracht;

import java.awt.*;
import javax.swing.*;
import laan.turtle.JTurtle;

/**
 *
 * @author Mauricio
 */
public class PolySpiral  {
    private JTurtle turtle;

    public PolySpiral(JTurtle turtle) {
        this.turtle = turtle;
    }
    void drawPolySpiral(int length, int angle) {
        for(int i = 0; i < 150; i++) {
            turtle.setPenColor(Color.getHSBColor( i / 150f, 1.0f, 1.0f ));
            turtle.forward(length);
            turtle.right(angle);
            length = length + 3;
        }
    }
}
