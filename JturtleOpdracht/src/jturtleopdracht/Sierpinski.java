package jturtleopdracht;

import java.awt.Color;
import laan.turtle.JTurtle;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Mauricio
 */
public class Sierpinski {

    private JTurtle turtle;
    private int m_order = 7;
    private int m_suborder = 1;

    public Sierpinski(JTurtle turt) {
        turtle = turt;
    }

    private void drawTriangle(int points[][]) {
        turtle.forward(1);
        turtle.setPos(points[0][0], points[0][1]);
        turtle.back(1);
        //fill
        turtle.setPos(points[1][0], points[1][1]);
        turtle.setPos(points[2][0], points[2][1]);
        turtle.setPos(points[0][0], points[0][1]);
        //endfill
    }

    public void drawTriangle(int order, double length) {
        Color colorIndex[] = {Color.blue, Color.cyan, Color.pink, Color.yellow, Color.green, Color.red, Color.magenta, Color.orange};
        if (order > 1) {
            drawTriangle(order - 1, length / 2);
            turtle.penup();
            turtle.fd(length / 2);
            turtle.pendown();
            drawTriangle(order - 1, length / 2);
            turtle.penup();

            turtle.rt(-60);
            turtle.fd(length / 2);
            turtle.rt(-60);
            turtle.pendown();
            drawTriangle(order - 1, length / 2);
            turtle.penup();
            turtle.bk(length / 2);
            turtle.rt(120);
            turtle.bk(length);
            turtle.pendown();
        }
        turtle.setPenColor(colorIndex[order % 8]);
        turtle.fd(length);
        turtle.rt(-120);
        turtle.fd(length);
        turtle.rt(-120);
        turtle.fd(length);
        turtle.rt(-120);
    }
}
