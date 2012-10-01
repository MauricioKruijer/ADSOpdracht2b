/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jturtleopdracht;

import java.applet.Applet;
import java.awt.Graphics; 
import laan.turtle.JTurtle;
import laan.turtle.JTurtlePos;

/**
 *
 * @author John
 */
public class JturtleOpdracht extends Applet {

    JTurtle turt;
    JTurtlePos pos;
    Tree tree1;
    PolySpiral spiral;

    @Override
    public void init() {
        this.setSize(700, 500);
        turt = new JTurtle(this);
        tree1 = new Tree(turt);
        spiral = new PolySpiral(turt);
    }

    @Override
    public void paint(Graphics g) {
        turt.init();
        turt.hide();
        turt.penup();
        
        turt.pendown();
        spiral.drawPolySpiral( 1, 500 );
        tree1.drawTree(10, 10);
    }
}