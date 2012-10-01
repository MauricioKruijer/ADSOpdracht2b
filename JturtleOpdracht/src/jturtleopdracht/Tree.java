package jturtleopdracht;

import laan.turtle.JTurtle;

/**
 *
 * @author John
 */
public class Tree {

    private JTurtle turtle;

    public Tree(JTurtle turtle) {
        this.turtle = turtle;
    }

    void drawTree(double length, int depth) {
        if (depth == 0) {
            turtle.fd(length);
            turtle.bk(length);
        } else {
            turtle.fd(length);
            turtle.lt(30);
            drawTree(3 * length / 3, depth - 1);
            turtle.rt(90);
            drawTree(3 * length / 3, depth - 1);
            turtle.lt(60);
            turtle.bk(length);
        }
    }
}