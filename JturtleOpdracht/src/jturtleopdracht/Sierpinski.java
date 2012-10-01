package jturtleopdracht;

import laan.turtle.JTurtle;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauricio
 */
public class Sierpinski {
    private JTurtle turtle;
    
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
    
    public void drawTriangle(double x1, double y1, double x2, double y2, double x3, double y3, int depth) {
        double  x1_2 = (x1 + x2) / 2, 
                y1_2 = (y1 + y2) / 2;
        double  x1_3 = (x1 + x3) / 2,
                y1_3 = (y1 + y3) / 2;
        double  x2_3 = (x2 + x3) / 2,
                y2_3 = (y2 + y3) / 2;
        
        if(depth > 0) {
            drawTriangle(x1, y1, x1_2, y1_2, x1_3, y1_3, depth - 1);
            drawTriangle(x1_2, y1_2, x2, y2, x2_3, y2_3, depth - 1);
            drawTriangle(x1_3, y1_3, x2_3, y2_3, x3, y3, depth - 1);
        } else {
            double[] xPoints = {x1, x2, x3}, 
                     yPoints = {y1, y2, y3};
            // hier dan nog een methode voor die lameass triangle op x-y as T_T
            // new Polygon(xPoints, yPoints); is de originele
            turtle.left(y1);
            turtle.fd(y2);
            turtle.right(x1);
            turtle.fd(x2);
            turtle.right(y3);
            turtle.fd(x3);
        }
    }
    
}
