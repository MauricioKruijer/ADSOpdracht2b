package jturtleopdracht;

import laan.turtle.JTurtle;
import laan.turtle.JTurtlePos;

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
            turtle.lt(20);
            JTurtlePos pos = turtle.getPos();
            drawTree(length % 32, depth - 1);
            turtle.setPos(pos);
            turtle.rt(30);
            drawTree(length, depth - 1);

        }
    }
}