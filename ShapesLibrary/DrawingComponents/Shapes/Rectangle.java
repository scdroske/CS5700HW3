package Shapes;

import java.awt.geom.Point2D;

public class Rectangle{

    public void rectangle(int x1,int y1, int width, int height){
        java.awt.Rectangle rect1 = new java.awt.Rectangle(x1,y1, width, height);
    }

//read in values from script

    int width = 45;
    int height = 200;
    int x1 = 40;
    int y1 = 43;


    java.awt.Rectangle rect1 = new java.awt.Rectangle(x1,y1, width, height);
}
