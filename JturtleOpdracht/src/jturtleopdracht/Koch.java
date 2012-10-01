/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jturtleopdracht;

import laan.turtle.JTurtle;

/**
 *
 * @author Mauricio
 */
public class Koch {

    private JTurtle turtle;

    public Koch(JTurtle turtle) {
        this.turtle = turtle;
    }

    void drawLine(double length, int depth) {
        if (depth <= 0) {
            turtle.forward(length);
        } else {
            drawLine(length / 3, depth - 1);
            turtle.left(60);
            drawLine(length / 3, depth - 1);
            turtle.right(120);
            drawLine(length / 3, depth - 1);
            turtle.left(60);
            drawLine(length / 3, depth - 1);
        }
    }

    void drawSnowflake(double length, int depth) {
        drawLine(length, depth);
        turtle.right(120);
        drawLine(length, depth);
        turtle.right(120);
        drawLine(length, depth);
        turtle.right(120);
    }
}
