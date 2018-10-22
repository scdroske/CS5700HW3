package Shapes;

import java.awt.geom.Point2D;

public class Rectangle {
//read in values from script
    Point2D point = new Point2D() {
    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public void setLocation(double x, double y) {

    }
};
    int width = 450;

    public int getWidth(int w) {
        w = 200;
        width = w;
        return width;
    }

    int height = 200;

    public int getHeight(int h) {
        h = 400;
        height = h;
        return height;
    }

    int x1 = 40;

    public int getX1(int x) {
        x = 30;
        x1 = x;
        return x1;
    }

    int y1 = 43;
    public int getY1(int y){
        y = 40;
        y1 = y;
        return y1;
    }

    java.awt.Rectangle rect1 = new java.awt.Rectangle(x1,y1, width, height);
}
