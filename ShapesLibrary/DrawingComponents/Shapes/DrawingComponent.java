package Shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class DrawingComponent extends JComponent {

    public void paintComponent(Graphics g){
         Graphics2D graphic = (Graphics2D) g;

         Color color = new Color(255,0,0);
         Rectangle rect = new Rectangle();

         graphic.setColor(color);
         graphic.fill(rect.rect1);

        Ellipse2D.Double ellipse1 = new Ellipse2D.Double(100,100,30,25);
        graphic.fill(ellipse1);

        Line2D.Double line1 = new Line2D.Double(150,150,200,100);
        graphic.draw(line1);

        Point2D.Double point1 = new Point2D.Double(200,200);
        Point2D.Double point2 = new Point2D.Double(500,200);

        Line2D.Double line2 = new Line2D.Double(point1, point2);
        graphic.draw(line2);
    }



}
