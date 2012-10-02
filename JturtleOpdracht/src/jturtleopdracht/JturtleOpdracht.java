/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jturtleopdracht;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import laan.turtle.JTurtle;
import laan.turtle.JTurtlePos;

/**
 *
 * @author John
 */
public class JturtleOpdracht extends Applet {

    JTurtle turt;
    JTurtlePos pos;
    Tree tree;
    //PolySpiral spiral;
    //Koch koch;
    Sierpinski s;

    @Override
    public void init() {
        this.setSize(700, 500);
        turt = new JTurtle(this);
        tree = new Tree(turt);

    }

    @Override
    public void paint(Graphics g) {
        turt.init();
        turt.hide();
        turt.rt(30);
        tree.drawTree(50, 5);
    }
}
