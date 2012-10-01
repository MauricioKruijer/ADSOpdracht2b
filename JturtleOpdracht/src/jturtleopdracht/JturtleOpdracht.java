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
    //Tree tree1;
    //PolySpiral spiral;
    Koch koch;
    
    @Override
    public void init() {
        this.setSize(700, 500);
        turt = new JTurtle(this);
        //tree1 = new Tree(turt);
        //spiral = new PolySpiral(turt);
        koch = new Koch(turt);
    }

    @Override
    public void paint(Graphics g) {
        // TREE / SPIRAL START
//        turt.init();
//        turt.hide();
//        turt.penup();
//        
//        turt.pendown();
        // TREE / SPIRAL END
        // spiral
        //spiral.drawPolySpiral( 1, 500 );
        // tree
        //tree1.drawTree(10, 10);
        
        // KOCH START
        turt.init();
        turt.hide();
        turt.penup();
        turt.fd(100); 
        turt.right(90); 
        turt.bk(150); 
        turt.pendown(); 
        koch.drawSnowflake(300, 4);
        // KOCH END
    }
}