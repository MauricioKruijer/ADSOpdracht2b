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
    Tree tree1;
    //PolySpiral spiral;
    //Koch koch;
    Sierpinski s;

    @Override
    public void init() {
        this.setSize(700, 500);
        turt = new JTurtle(this);
        tree1 = new Tree(turt);
        //spiral = new PolySpiral(turt);
        //koch = new Koch(turt);
        //s = new Sierpinski(turt);
    }

    @Override
    public void paint(Graphics g) {
         //TREE / SPIRAL START
        turt.init();
        turt.hide();
        turt.penup();
        
        turt.pendown();
         //TREE / SPIRAL END
        // spiral
       // spiral.drawPolySpiral( 1, 500 );
        // tree
        tree1.drawTree(100, 10);

        // KOCH START
//        turt.init();
//        turt.hide();
//        turt.penup();
//        turt.fd(100); 
//        turt.right(90); 
//        turt.bk(150); 
//        turt.pendown(); 
//        koch.drawSnowflake(300, 4);
        // KOCH END
//        turt.init();
//        //turt.hide();
//        turt.penup();
//        turt.setPos(50, 700, 0);
//        //turt.right(90);
//        //s.drawTriangle(.1, .1, .5, .9, .9, 1, 7);
//        for (int i = 1; i <= 1; i++) {
//            s.drawTriangle(8, 720);
//            turt.rt(90);
//        }
    }
}