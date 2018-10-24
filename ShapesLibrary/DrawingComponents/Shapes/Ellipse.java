package Shapes;

import java.awt.geom.Ellipse2D;

public class Ellipse {
    public void ellipse(int x1,int y1, int width, int height){
        Ellipse2D.Double ellipse = new Ellipse2D.Double(x1, y1, width, height) {
        };
    }
}
