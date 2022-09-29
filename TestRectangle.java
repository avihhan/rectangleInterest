package org.gitProject;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class TestRectangle extends Canvas{

    Rectangle R1 = new Rectangle();
    Rectangle R2 = new Rectangle();

//setters R1 & R2
    //assigning values to R1 and R2
    public void setR1() {
        R1.setX(45);R1.setY(60);R1.setHeight(30);R1.setWidth(4);
    }
    public void setR2() {
        R2.setX(20);R2.setY(10);R2.setHeight(4);R2.setWidth(4);
    }

    public boolean IsOverlap() {
        if(R2.x>R1.x && R2.y>R1.y) {
            if(R1.y+R1.height>R2.y && R2.x+ R2.width>R1.x) {
                return true;
            }
            return false;
        }
        else if(R2.x<R1.x && R1.y<R2.y) {
            if(R1.y+ R1.height>R2.y && R2.x+ R2.width>R1.x) {
                return true;
            }
            return false;
        }
        else if(R1.x>R2.x && R1.y>R2.y) {
            if(R2.y+R2.height>R1.y && R1.x+R1.width>R2.x) {
                return true;
            }
            return false;
        }
        else {
            if(R2.x+R2.width>R1.x && R2.y+ R2.height>R1.y) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        // write your code here
        TestRectangle rectangles = new TestRectangle();

//printing R1 & R2 using @overridden toString method
        rectangles.setR1();
        System.out.println(rectangles.R1.toString());

        rectangles.setR2();
        System.out.println(rectangles.R2.toString());

//checking if rectangles overlap or not
        System.out.println(rectangles.IsOverlap());

//Graphics: for visual representation of rectangles overlapping
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new TestRectangle();
        canvas.setSize(700, 700);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

    }

    public void paint(Graphics g) {

        TestRectangle rectangles = new TestRectangle();
        rectangles.setR1(); rectangles.setR2();

        //setting scale (for better visual representation) -> 1 unit : 10px
        int scale=10;

//        //axis inversion: the graph has (0,0) index at top-left corner, so we need to change axis
//        int frameHeight = 700; //in px
//        //height => -height

        //R1
        g.setColor(Color.RED);
//        g.drawRect(16*scale,4*scale,4*scale,4*scale);
        g.drawRect((int) (rectangles.R1.x*scale),(int) (rectangles.R1.y*scale),(int) (rectangles.R1.width*scale),(int)(rectangles.R1.height*scale));

        //R2
        g.setColor(Color.black);
//        g.drawRect(20*scale,10*scale,4*scale,4*scale);
        g.drawRect((int) (rectangles.R2.x*scale),(int) (rectangles.R2.y*scale),(int) (rectangles.R2.width*scale),(int)(rectangles.R2.height*scale));

        int yAxis=620;
        g.drawString(rectangles.R1.toString(),350,20+yAxis);
        g.drawString(rectangles.R2.toString(),350,35+yAxis);


        String isOverlapping;
        if(rectangles.IsOverlap())
            isOverlapping="The rectangles are overlapping";
        else
            isOverlapping="The rectangles are not overlapping";

        g.drawString(isOverlapping,350,50+yAxis);
        g.drawString("Scale: "+scale+"px",350,65+yAxis);
    }
}
